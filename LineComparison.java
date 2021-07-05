public class LineComparison{
	public boolean isEqualto(int x1,int x2,int y1,int y2,int p1,int p2,int q1,int q2){
		double len1 = Math.sqrt((x2-x1)*(x2-x1)+((y2-y1)*(y2-y1)));
                double len2 = Math.sqrt((p2-p1)*(p2-p1)+((q2-q1)*(q2-q1)));
		if (len1 == len2)
			return true;
		return false;
}
}
