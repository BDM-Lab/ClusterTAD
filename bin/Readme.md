-----------------------------------------------------------


- To run the program, open command line and type: java -jar ClusterTAD.jar Input_Matrix_file Matrix_Resolution 


Parameters are as follow:
	*  **Input_Matrix_file** :  A tab(\t) seperated N by N intra-chromosomal Hi-C contact matrix.
	*  **Matrix_Resolution** :  Contact Matrix Resolutions
	
	other parameters : 
	java -jar ClusterTAD.jar Input_Matrix_file Matrix_Resolution Number_of_Cluster_SearchWindow Min_TAD_size Max_TAD_size
	
	^  **Number_of_Cluster_SearchWindow** : The window for upper limit and lower limit from the roughly estimated K in algorithm, The default = 3 [Minimum = 1 and Maximum = 10)
	*  **Min_TAD_size(optional)**	:  Defines the  Minimum TAD size. The default is 120KB
	*  **Max_TAD_size(optional)** : Defines the  Maximum TAD size. The default is 800KB. TAD size above this is considered for ClusterTAD Reclustering.
	
	
	
	For example:  java -jar Clustertad.jar data/30x30_data.txt 40000 
	
**Output**

ClusterTAD produces 2 folders in Output folder:

Folder-Clusters :
 * 	Contains a .txt file that contains the cluster assignment for the diagonal from the upper limit of rough estimate (K) to lower limit of K [i.e K-window to K+window]
	Filename = file_30x30_data_cluster.txt
	
 Folder-TADs: 
 *	Contains the .txt file listing the TADs extracted from each clustering and reclustering done
 *	Contains the Best TAD identified based on the Quality score, labeled as "BestTAD_[nameofinputfile]_K=.txt" = BestTAD_30x30_data_K=4.txt
 *  Contains a .txt file of the list of Quality scores, file name = [nameofinputfile]_TAD_QualityScore_List = 30x30_data_TAD_QualityScore_List.txt