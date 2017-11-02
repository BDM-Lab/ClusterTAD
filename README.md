# ClusterTAD
A clustering method for identifying topologically associated domains (TADs) from Hi-C data

-----------------------------------------------------------
Hi-C Data used in this study
-----------------------------------------------------------
In our study, used the normalized Hi-C  matrix processed by Bing Ren's Lab in University of Calfornia, San Diego. 
Download the normalized Matrix here : http://chromosome.sdsc.edu/mouse/hi-c/download.html

-----------------------------------------------------------
Input matrix file format
-----------------------------------------------------------
Our input matrix file format is the same as normalized matrix in Bing Ren's Lab and no additional pre-process are required.

-----------------------------------------------------------
Source Code
-----------------------------------------------------------

-----------------------------------------------------------
1.	Java Code
-----------------------------------------------------------
	
	1.1 Dependency: 
	
		1.1.1	To perform clustering, ClusterTAD relies on the weka library. Import the "weka.jar" file in the lib folder. Weka version "weka-3-7-12" was used in this work.
		
	1.2 Test ClusterTAD.java			
			
		Test with the 30x30_data.txt file in the data directory.
		
		1.2.1	Place the "data" folder in same directory as the ClusterTAD.java file. [data folder contains your Input data]
		1.2.2 	Run the program :  It should print the usage information.
		1.2.3	Results will be found in the "Output" folder
		1.2.4	The TAD with the Best quality score will be in the format: "BestTAD_'filename'_K='otherdetails'.txt". For instance for this example: BestTAD_30x30_data_K=4.txt
					
		
	1.3 For a new dataset change variable values in the ClusterTAD.java file
	
		1.3.1	change variable "name" to the Input data name
		1.3.2	change variable "Resolution" to the Input data Resolution		
		1.3.3	specify the minimum TAD size : change variable "min_TAD_size" (optional)
		1.3.4	specify the maximum TAD size : change variable "max_TAD_size" (optional)
	
	1.4 Execute the program and the results will be found in the "Output" folder
		

		
2.	MATLAB Code

	2.1 Test ClusterTAD_main.m => Test with the 30x30_data.txt in the data directory.
	
		2.1.1	Place the "data" folder in same directory as the ClusterTAD_main file. [data folder contains your Input data]
		2.1.2 	Run the program :  It should print the usage information.
		2.1.3	Results will be found in a folder named after the filename. In this case, "30x30_data.txt"
		2.1.4	The name of the recommended TAD file will be printed out, and will also found in a Readme file in the Quality sub-directory (Quality/).
		2.1.5	All the TADs generated will be found in the TAD sub-directory (TADs/)
		
	
		
	2.2 For a new dataset change variable values in the ClusterTAD_main.m file
	
		2.2.1	change variable "filepath" to the Input data file path	
		2.2.2	change variable "name" to the Input data name
		2.2.3	change variable "chromo" to the chromosome data name
		2.2.4	change variable "Reso" to the Input data Resolution		
		2.2.5	change variable "Option" to specify  the  K finding method. if option == 0, use rough estimate and if option == 1, use elbow method (Read about this in our manuscript)
		2.2.6	specify the maximum TAD size : change variable "Max_TADsize" (optional)
	
	
	2.3 Execute the program and the results will be found in the  "data_Results/Resolution/filename" folder
	
	2.4 The name of the recommended TAD file will be printed out.
	
	2.5 If reclustering is enabled, The quality score and the name of the best TAD at each clustering Iteration will be in the 'Quality/' folder. They will be represented as follows:
	
		2.5.1	Readme_'filename'.txt 			=> ClusterTAD Clustering Iteration 1
		2.5.2	Readme_Recluster'filename'.txt 	=> ClusterTAD Clustering Iteration 2
		2.5.3	Readme_Recluster2'filename'.txt => ClusterTAD Clustering Iteration 3
	
	2.6 The name of the recommended TAD file  printed out in point-'2.4' above will be the maximum quality score of the 3 scores in point-'2.5'
		
		
-----------------------------------------------------------
TAD identified by ClusterTAD
-----------------------------------------------------------
For two cell types(mESC and mouse cortex), we identified topological domains in each cell type using ClusterTAD. 
The TADs identified at each clustering iteration are labelled as follows:
ClusterTAD Clustering Iteration 1					 => ClusterTAD_1
ClusterTAD Clustering Iteration 2 (Reclustering 1)  => ClusterTAD_2 (Recommended)
ClusterTAD Clustering Iteration 3 (Reclustering 1)	 => ClusterTAD_3

Download the TADs extracted from the TADs folder. 

-----------------------------------------------------------
Authors
-----------------------------------------------------------
Oluwatosin Oluwadare and Dr. Jianlin Cheng (PI)

please cite :

Contact : 
								Jianlin Cheng,Professor
			Director of Bioinformatics, Data Mining, and Machine Learning Lab (BDM) 
							Department of Computer Science,
						University of Missouri, Columbia, MO
						Phone: 573-882-7306		Fax: 573-882-8318
							Email: chengji@missouri.edu

