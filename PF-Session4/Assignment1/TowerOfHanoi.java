import java.util.ArrayList;
import java.util.List;

/*
 * This file is contains a class which prints the tower for hanoi condition
 */

/**
 * Tower of Hanoi is a class which contains a method for tower of hanoi problem
 * @author Animesh Agarwal
 *
 */
class TowerOfHanoi
{
	/**
	 * 
	 * @param {int}n Number of disks to be used
	 * @param {char}from_rod main
	 * @param to_rod
	 * @param aux_rod
	 * @return
	 * @throws DiskException
	 */
    List<String> towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) throws DiskException {
    	List<String> ls = new ArrayList<String>();
    	List<String> temp = new ArrayList<String>();
    	if(n <= 0) {
    		throw new DiskException("No of disk cant be zero");
    	}
        if (n == 1)
        {
            ls.add("Move disk 1 from rod " +  from_rod + " to rod " + to_rod);
            return ls;
        }
        temp = towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
        ls.addAll(temp);
        ls.add("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
        temp = towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
        ls.addAll(temp);
        return ls;
    }
     
}

