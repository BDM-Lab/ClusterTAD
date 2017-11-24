# ClusterTAD : An unsupervised machine learning approach to detecting topologically associated domains of chromosomes from Hi-C data

**Bioinformatics, Data Mining, Machine Learning (BDM) Laboratory,**

**University of Missouri, Columbia MO 65211 **


**Developer:** 

             Oluwatosin Oluwadare 
             Department of Computer Science 
             University of Missouri, Columbia 
             Email: oeow39@mail.missouri.edu 

**Contact:** 

             Jianlin Cheng, PhD 
             Department of Computer Science 
             University of Missouri, Columbia 
             Email: chengji@missouri.edu 
			 
	

1.	Content of folders :
-----------------------------------------------------------	
* bin: contains executable files 
* examples: contains example data and outputs generated from ClusterTAD for these datasets 
* src: ClusterTAD java and MATLAB source codes
* TADs: contains identified topological domains for two mESC and mouse cortex cell type using ClusterTAD


2.	Hi-C Data used in this study
-----------------------------------------------------------
In our study, used the normalized Hi-C  matrix processed by Bing Ren's Lab in University of Calfornia, San Diego. 
Download the normalized Matrix here : http://chromosome.sdsc.edu/mouse/hi-c/download.html


3.	Input matrix file format
-----------------------------------------------------------
The input to ClusterTAD is a tab(\t) seperated N by N intra-chromosomal contact matrix derived from Hi-C data, where N is the number of equal-sized regions of a chromosome.


4.	Usage
-----------------------------------------------------------
To run the tool type, java -jar ClusterTAD.jar Input_Matrix_file Matrix_Resolution 

Parameters are as follow:
	*  **Input_Matrix_file** :  A tab(\t) seperated N by N intra-chromosomal Hi-C contact matrix.
	*  **Matrix_Resolution** :  Contact Matrix Resolutions
	other parameters : java -jar ClusterTAD.jar Input_Matrix_file Matrix_Resolution Number_of_Cluster_SearchWindow Min_TAD_size Max_TAD_size
	^  **Number_of_Cluster_SearchWindow** : The window for upper limit and lower limit from the roughly estimated K in algorithm, The default = 3 [Minimum = 1 and Maximum = 10)
	*  **Min_TAD_size(optional)**	:  Defines the  Minimum TAD size. The default is 120KB
	*  **Max_TAD_size(optional)** : Defines the  Maximum TAD size. The default is 800KB. TAD size above this is considered for ClusterTAD Reclustering.

See in /examples/ for sample files

5.	Output
-----------------------------------------------------------
ClusterTAD produces 2 folders in Output folder:

Folder-Clusters : Contains a .txt file that contains the cluster assignment for the diagonal from the upper limit of rough estimate (K) to lower limit of K [i.e K-window to K+window]
Folder-TADs: 
 *	Contains the .txt file listing the TADs extracted from each clustering and reclustering done
 *	Contains the Best TAD identified based on the Quality score, labeled as "BestTAD_[nameofinputfile]_K=.txt"
 *  Contains a .txt file of the list of Quality scores, file name = [nameofinputfile]_TAD_QualityScore_List
 
5. Disclaimer
-----------------------------------------------------------
The executable software and the source code of LorDG is distributed free of charge as it is to any non-commercial users. The authors hold no liabilities to the performance of the program.


6. Citations
-----------------------------------------------------------
Oluwadare, Oluwatosin, and Jianlin Cheng. "ClusterTAD: an unsupervised machine learning approach to detecting topologically associated domains of chromosomes from Hi-C data." BMC bioinformatics 18.1 (2017): 480.
	
-----------------------------------------------------------