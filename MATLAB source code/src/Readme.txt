To use ClusterTAD

1.	MATLAB Code

	1.1 Test ClusterTAD_main.m => Test with the 30x30_data.txt in the data directory.
		2.1.1	Place the "data" folder in same directory as the ClusterTAD_main file. [data folder contains your Input data]
		2.1.2 	Run the program :  It should print the usage information.
		2.1.3	Results will be found in a folder named after the filename. In this case, "30x30_data.txt"
		2.1.4	The name of the recommended TAD file will be printed to screen, and also will be found in a Readme file in the Quality sub-directory (Quality/).
				All the TADs generated will be found in the TAD sub-directory (TAD/)
		
		---------------------
		Using New Dataset
		---------------------
		
	1.2 Change variable values in the ClusterTAD_main.m file
		1.2.1	change variable "filepath" to the Input data file path	
		1.2.2	change variable "name" to the Input data name
		1.2.3	change variable "chromo" to the chromosome data name
		1.2.4	change variable "Reso" to the Input data Resolution		
		1.2.5	change variable "Option" to specify  the  K finding method. if option == 0, use rough estimate and if option == 1, use elbow method (Read about this in our manuscript)
		1.2.6	specify the maximum TAD size : change variable "Max_TADsize" (optional)
	
	
	1.3 Execute the program, and the results will be found in the  "data_Results/Resolution/filename" folder
	
	1.4 The name of the recommended TAD file will be printed to screen.

	1.5 If reclustering is enabled, The quality score and the name of the best TAD at each clustering Iteration will be in the 'Quality/' folder. They will be represented as follows:
		2.5.1	Readme_'filename'.txt 			=> ClusterTAD Clustering Iteration 1
		2.5.2	Readme_Recluster'filename'.txt 	=> ClusterTAD Clustering Iteration 2
		2.5.3	Readme_Recluster2'filename'.txt => ClusterTAD Clustering Iteration 3
	
	1.6 The name of the recommended TAD file  printed out in point-'1.4' above will be the maximum quality score of the 3 scores in point-'1.5'
	
	
Download the Hi-C matrix for 40kb data from: http://chromosome.sdsc.edu/mouse/hi-c/download.html
