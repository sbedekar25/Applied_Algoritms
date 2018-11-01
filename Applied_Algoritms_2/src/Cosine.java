    public class Cosine
    {
        public static void Main(String[] args)
        {
        	double[] vecA = {1, 2, 3, 4, 5};
        	double[] vecB = {6, 7, 7, 9, 10};

           // double cosSimilarity = CalculateCosineSimilarity(vecA, vecB);

           // System.out.println(cosSimilarity);
 
        }

        private static double CalculateCosineSimilarity(double[] vecA, double[] vecB)
        {
        	double dotProduct = DotProduct(vecA, vecB);
            double magnitudeOfA = Magnitude(vecA);
            double magnitudeOfB = Magnitude(vecB);

            return dotProduct/(magnitudeOfA*magnitudeOfB);
        }

        private static double DotProduct(double[] vecA, double[] vecB)
        {
                      
            double dotProduct = 0;
            for (int i = 0; i < vecA.length; i++)
            {
                dotProduct += (vecA[i] * vecB[i]);
                
                
            }

            return dotProduct;
        }

        // Magnitude of the vector is the square root of the dot product of the vector with itself.
        private static double Magnitude(double[] vector)
        {
            return Math.sqrt(DotProduct(vector, vector));
        }
    }