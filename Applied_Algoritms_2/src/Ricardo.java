
public class Ricardo {

	public static void main(String[] args) {
		double[] vecA = {-2.6,0,-0.6,0,0,1.4,0,0,1.4,0,0.4,0};
    	double[] vecB = {1.2,0,-0.8,0,-0.8,0,0,0.2,0,0,-1.8,0};

        double cosSimilarity = CalculateCosineSimilarity(vecA, vecB);

        System.out.println(cosSimilarity);

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
