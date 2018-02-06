------------------------------------------------------------------------------------------------------------------------------------
# ClusterTAD : An unsupervised machine learning approach to detecting topologically associated domains of chromosomes from Hi-C data
------------------------------------------------------------------------------------------------------------------------------------
**Bioinformatics, Data Mining, Machine Learning (BDM) Laboratory,**

**University of Missouri, Columbia MO 65211**

----------------------------------------------------------------------

**Developer:** <br />
		 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Oluwatosin Oluwadare <br />
		 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Department of Computer Science <br />
		 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;University of Missouri, Columbia <br />
		 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Email: oeow39@mail.missouri.edu 

**Contact:** <br />
		 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Jianlin Cheng, PhD <br />
		 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Department of Computer Science <br />
		 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;University of Missouri, Columbia <br />
		 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Email: chengji@missouri.edu 
	 
--------------------------------------------------------------------	

**1.	Content of folders:**
-----------------------------------------------------------	
* **executable**: latest version can be downloaded from the release tab
* examples: contains example data and outputs generated from ClusterTAD for these datasets 
* src: ClusterTAD **Java** and **MATLAB** source codes
* TADs: contains identified topological domains for two mESC and mouse cortex cell type using ClusterTAD


**2.	Hi-C Data used in this study:**
-----------------------------------------------------------
In our study, we used the normalized Hi-C  matrix processed by Bing Ren's Lab in University of Calfornia, San Diego. 
Download the normalized Matrix here : http://chromosome.sdsc.edu/mouse/hi-c/download.html


**3.	Input matrix file format:**
-----------------------------------------------------------
The input to ClusterTAD is a tab seperated N by N intra-chromosomal contact matrix derived from Hi-C data, where N is the number of equal-sized regions of a chromosome.


**4.	Usage:**
-----------------------------------------------------------
**4.1. 	Java:** <br />
To run the tool, open command line interface and type: 	 **java -jar ClusterTAD.jar Input_Matrix_file Matrix_Resolution** 

Parameters are as follow:
 *  **Input_Matrix_file** :  A tab seperated N by N intra-chromosomal Hi-C contact matrix.
 *  **Matrix_Resolution** :  Contact Matrix Resolution.

**4.2. MATLAB:**<br />
Instructions on how to run the MATLAB source code is given here **_/src/MATLAB source code/_**



**5.	Output**
-----------------------------------------------------------
ClusterTAD produces 2 folders in Output folder:

**5.1. 	Clusters:**
 * Contains a *.txt* file that contains the cluster assignment for the diagonal for all the K values considered
 
**5.2.	TADs:** 
 *	Contains the *.txt* files listing the TADs extracted from each clustering and reclustering done.
 *	Contains the Best TAD identified based on the Quality score, labeled as "BestTAD_[nameofinputfile]_K=.txt".
 *  Contains a *.txt* file which contains a list of the extracted TAD Quality scores, file name = [nameofinputfile]_TAD_QualityScore_List.


**6. Disclaimer**
-----------------------------------------------------------
The executable software and the source code of ClusterTAD is distributed free of charge as it is to any non-commercial users. The authors hold no liabilities to the performance of the program.

**7. Citations**
-----------------------------------------------------------
Oluwadare, Oluwatosin, and Jianlin Cheng. "ClusterTAD: an unsupervised machine learning approach to detecting topologically associated domains of chromosomes from Hi-C data." BMC bioinformatics 18.1 (2017): 480.

**8. Common questions**
-----------------------------------------------------------
**8.1. 	What is the format of the domain output genererated?**

The domain extracted in ClusterTAD are presented in the format **_from.id	from.cord	to.id	to.cord_** where:
 *  **from.id** :  start bin id for a domain.
 *  **from.cord** :   coordinate of the start bin id for a domain based on data Resolution
 *  **to.id** :  end bin id for a domain.
 *  **to.cord** :   coordinate of the end bin id for a domain based on data Resolution

-----------------------------------------------------------
