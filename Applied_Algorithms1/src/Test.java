 public class Test {

      public static void main(String[] args) {
          int[] array = {13, 19, 9, 5, 12, 8, 7, 4, 21, 2, 6, 11};
          RandomizedQuickSort(array,0,array.length - 1);
          printArray(array);
          // return 2 4 5 6 7 8 9 11 12 13 19 21
      }

      public static void RandomizedQuickSort(int[] array, int startIndex, int endIndex) {
          if (startIndex < endIndex) {
              int pivot = randomizedPartition(array,startIndex,endIndex);
              RandomizedQuickSort(array,startIndex,pivot - 1);
              RandomizedQuickSort(array,pivot + 1,endIndex);
          }
      }

      public static int randomizedPartition(int[] A, int p, int r) {
          int k = (int)Math.floor(Math.random() * (r - p + 1) + p);
          int temp = A[r];
          A[r] = A[k];
          A[k] = temp;
                
          int pivotValue = A[r];
          int pivotIndex = p;

          for (int j = p; j < r; j++) {
              if (A[j] <= pivotValue) {
            	  
            	  temp = A[pivotIndex];
                  A[pivotIndex] = A[j];
                  A[j] = temp;
                  pivotIndex = pivotIndex + 1;
              }
          }
           temp = A[pivotIndex];
          A[pivotIndex] = A[r];
          A[r] = temp;
                            
          return pivotIndex;      
          }


      public static void swap(int[] array, int firstIndex, int secondIndex) {
          int temp = array[firstIndex];
          array[firstIndex] = array[secondIndex];
          array[secondIndex] = temp;
      }

      public static void printArray(int[] array) {
          for( int i = 0; i < array.length; i++) {
              System.out.print(array[i] + " ");
          }
      }
  }