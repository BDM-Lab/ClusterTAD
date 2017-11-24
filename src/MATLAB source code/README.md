
		
MATLAB Code
-----------------------------------------------------------
**1. Test ClusterTAD_main.m**
		
* Place the "data" folder in same directory as the ClusterTAD_main file. [data folder contains your Input data]
* Execute the program :  It should print the usage information.
* Results will be found in a folder named after the filename. In this case, "30x30_data.txt"
* The name of the recommended TAD file will be printed out, and will also found in a Readme file in the Quality sub-directory (Quality/).
* All the TADs generated will be found in the TAD sub-directory (TADs/)
	
	
**2. For a new dataset change variable values in the ClusterTAD_main.m file**

* change variable **"filepath"** to the Input data file path	
* change variable **"name"** to the Input data name
* change variable **"chromo"** to the chromosome data name (can be same as Input data name)
* change variable **"Reso"** to the Input data Resolution		
* change variable **"Option"** to specify  the  K finding method. if option == 0(Recommended), use rough estimate and if option == 1, use elbow method (Read about this in our manuscript)
* specify the maximum TAD size : change variable "Max_TADsize" (optional)


**3. Execute the program and the results will be found in the  "data_Results/Resolution/filename" folder**

**4. The name of the identified Best TAD file will be printed out.**

**5. If reclustering is enabled, The quality score and the name of the best TAD at each clustering Iteration will be in the 'Quality/' folder. They will be represented as follows:**

* Readme_'filename'.txt 		=> ClusterTAD Clustering Iteration 1
* Readme_Recluster'filename'.txt 	=> ClusterTAD Clustering Iteration 2
* Readme_Recluster2'filename'.txt => ClusterTAD Clustering Iteration 3

**6. The name of the recommended TAD file  printed out in point-'2.4' above will be the maximum quality score of the 3 scores in point-'2.5'**
		
