import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MovieRatingCollector {
	
    public static class RatingCollectorImpl implements RatingCollector {
    	static Map<String, Double> ratings=new HashMap<>();
    	static Map<String, Integer> count=new HashMap<>();
    	@Override
        public void putNewRating(String movie, double rating) {
            // YOUR CODE HERE
    		
    		if(ratings.containsKey(movie)){
    			ratings.put(movie,ratings.get(movie)+Double.valueOf(rating));
    			count.put(movie, count.get(movie)+1);
    		}else{
    			ratings.put(movie,Double.valueOf(rating));
    			count.put(movie, 1);
    		}
        }

        @Override
        public double getAverageRating(String movie) {
            // YOUR CODE HERE
        	Set<String> movies=ratings.keySet();
        	
        	return ratings.get(movie)/count.get(movie);
        }

        @Override
        public int getRatingCount(String movie) {
            // YOUR CODE HERE
        	return count.get(movie);
        }
    }

    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface RatingCollector {
        // This is an input. Make note of this rating.  Rating can be a double number between 0 and 100.
        void putNewRating(String movie, double rating);

        // Get the average rating
        double getAverageRating(String movie);

        // Get the total number of ratings received for the movie
        int getRatingCount(String movie);
    }

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int numLines = Integer.parseInt(scanner.nextLine());
        int currentLine = 0;
        while (currentLine++ < numLines) {
            final RatingCollector stats = new RatingCollectorImpl();
            final Set<String> movies = new TreeSet<>();

            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            for (int i = 0; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String symbol = tokens[0];
                movies.add(symbol);
                final double price = Double.parseDouble(tokens[1]);

                stats.putNewRating(symbol, price);

            }

            for (String movie : movies) {
                System.out.println(
                        String.format("%s %.4f %d", movie, stats.getAverageRating(movie), stats.getRatingCount(movie)));
            }

        }
        scanner.close();

    }
}