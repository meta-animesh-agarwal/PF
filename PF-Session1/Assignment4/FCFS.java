/*
 * This file contains a class to implement 
 * first in first out job scheduling
 */

/**
 * FCFS is an class to implement first 
 * in first out job scheduling
 * @author Animesh Agarwal
 *
 */
public class FCFS {
	/**
	 * Fcfs is a function implement first 
     * in first out job scheduling
	 * @param arrival_time
	 * @param job_size
	 * @return
	 */
	 int [][]Fcfs(int arrival_time [], int job_size[]) {
		int length = arrival_time.length;
		int[][] fcfs = new int[length][5];
		for(int i = 0; i < length; i++) {
			fcfs[i][0] = i + 1;		//Job
			fcfs[i][1] = arrival_time[i];       //Job Arrival Time
			if(i == 0) {
				fcfs[0][2] = 0;					//Job Wait Time
				fcfs[0][3] = 1;					//Job Start At
			}
			else {
				if(arrival_time[i] < (fcfs[i-1][3] + job_size[i-1])) {
					fcfs[i][3] = fcfs[i-1][3] + job_size[i-1];		//Job Start At
					fcfs[i][2] = fcfs[i][3] - arrival_time[i];		//Job Wait Time
				}
				else {
					fcfs[i][3] = arrival_time[i];					//Job Start At
					fcfs[i][2] = 0;
				}
				
			}
			fcfs[i][4] = fcfs[i][3] + job_size[i] - 1;			//Job Finish At			
		}
		return fcfs;
	 }
}