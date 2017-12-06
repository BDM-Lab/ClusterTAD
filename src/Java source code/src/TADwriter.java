import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class TADwriter {
	
	/**
	 *  Create a new folder		
	 * @param folder
	 * @throws Exception
	 */
	public void make_folder(String folder) throws Exception{
		File file = new File(folder);
		file.mkdirs();
	}
	/**
	 * Check if a file exist
	 * @param fileName
	 * @return
	 */
	
	public boolean isExist(String fileName){
		File f = new File(fileName);
		return f.exists();
	}
	/**
	 * Delete a created file
	 * @param file_name
	 * @throws Exception
	 */		
	public void delete_file(String file_name) throws Exception{
		File file = new File(file_name);
		if (file.exists() && file.isFile()) file.delete();
		else if(file.isDirectory()){
			for(File f : file.listFiles()){
				delete_file(f.getAbsolutePath());
			}
			file.delete();
		}
	}
	
	/**
	 * Write TAD to file
	 * @param filename
	 * @param matrix
	 * @param Res
	 * @throws IOException
	 */
	public void writeTAD(String filename, int[][] matrix, int Res) throws IOException {
		BufferedWriter log_outputwriter =  new BufferedWriter(new FileWriter(filename));
		 log_outputwriter.write(String.format("%s\t%s\t%s\t%s\n", "from.id","from.cord","to.id","to.cord"));
		  for (int i = 0; i <  matrix.length; i++) {			 
				  
				  log_outputwriter.write(String.format("%d\t%d\t%d\t%d\n",  matrix[i][0],  matrix[i][0]*Res, matrix[i][1],  matrix[i][1]*Res));
		  }
		  	log_outputwriter.flush();  
		 	log_outputwriter.close();
	}
	
	
	
	
	/**
	 * write matrix to file
	 * @param filename
	 * @param matrix
	 * @throws IOException 
	 */
	
	public void writeMatrix(String filename, int[][] matrix) {

	    try {
	        FileWriter writer = new FileWriter(filename, true);
	        for (int i = 0; i <  matrix.length; i++) {
	            for (int j = 0; j <  matrix[i].length; j++) {
	                  writer.write( matrix[i][j]+ "\t");
	            }
	            //this is the code that you change, this will make a new line between each y value in the array
	            writer.write("\n");   // write new line
	        }
	        writer.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	}
	
	/**
	 * Write List to file
	 * @param filename
	 * @param Q
	 */
	public void writeList(String filename, List <Double> Q) {
			Object[] objects = Q.toArray();
			
	    
			try {
	        FileWriter writer = new FileWriter(filename, true);
	        for (int i = 0; i <  objects.length; i++) {	           
	                  writer.write( String.valueOf(objects[i]));
	           
	            //this is the code that you change, this will make a new line between each y value in the array
	            writer.write("\n");   // write new line
	        }
	        writer.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	}
	
	
}
