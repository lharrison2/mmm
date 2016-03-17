
public class MedianMode {
	
	public static void main(String[] args) {
	
		double median = 0;
		double meanAvg = 0;	
		double mode = 0;
	
		double[] mArray = {2, 7, 8, 29, 32, 33, 47, 72, 88, 92};
		
		System.out.println("The median is:  " +  median);
		System.out.println("The mean is:  " +  meanAvg);
		System.out.println("The mode is:  " +  mode);
	}

public static double mean(double meanAvg, double[] mArray) {
	
	double sum = 0;
    
    for (int i = 0; i < mArray.length; i++) {
        sum += mArray[i];
        meanAvg = sum / i;
    }
    return meanAvg;
}

public static double medianMid(double median, double[] mArray) {
    median = mArray.length/2;
    if (mArray.length % 2 == 1) {
        return mArray[(int) median];
    } else {
        return (mArray[(int) (median-1)] + mArray[(int) median]) / 2.0;
    }
}

public static double mode(double mode, double[] mArray) {
    int maxCount = 0;
	int count = 0;
    for (int i = 0; i < mArray.length; i++) {
       for (int j = 0; j < mArray.length; j++) {
           if (mArray[j] == mArray[i]) ++count;
        	}
        if (count > maxCount) {
            maxCount = count;
            mode = mArray[i];
        }
    }

    return mode;
}
}
//references:
//http://www.dreamincode.net/forums/topic/284013-mean-median-mode-problem/
