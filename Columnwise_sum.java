package Column_sum;
import java.util.*;
public class Columnwise_sum {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the number of rows: ");
		        int rows = scanner.nextInt();
		        System.out.print("Enter the number of columns: ");
		        int columns = scanner.nextInt();

		        int[][] matrix = new int[rows][columns];
		        System.out.println("Enter the matrix elements:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < columns; j++) {
		                matrix[i][j] = scanner.nextInt();
		            }
		        }
		        int[] columnSum = getColumnSum(matrix);
		        System.out.print("Column-wise sums: ");
		        for (int sum : columnSum) {
		            System.out.print(sum + " ");
		        }
		    }

		    public static int[] getColumnSum(int[][] matrix) {
		        int rows = matrix.length;
		        int columns = matrix[0].length;
		        int[] columnSum = new int[columns];

		        for (int j = 0; j < columns; j++) {
		            int sum = 0;
		            for (int i = 0; i < rows; i++) {
		                sum += matrix[i][j];
		            }
		            columnSum[j] = sum;
		        }

		        return columnSum;
		    }
		}
