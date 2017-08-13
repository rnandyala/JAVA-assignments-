class Statistics{
static double mean(int [] ss){
double sum=0;
//ss={1,2,3,4,5}
for(int i=0;i<ss.length;i++)
{sum=sum+ss[i];
}
double x=sum/ss.length;
return x;
} 
static double stddev(int[] ss){
double sum=0;
double stand=0;
double m=mean(ss);
for (int j=0;j<ss.length;j++){
sum+=Math.pow(ss[j]-m,2);
stand=sum/(ss.length-1);
//return Math.sqrt(stand);
}
return Math.sqrt(stand);
}
public static void main (String[] args){ 
int [] s={1,1,1,1,1,1,1,1,1,1};
int [] t={1,2,1,2,1,2,1,2,1,2};
int [] u={0,1000,0,1000,0,1000,0,1000};
int [] v={1002,1000,1002,1000,1002,1000};
System.out.println(mean(s));
System.out.println(mean(t));
System.out.println(mean(u));
System.out.println(mean(v));
System.out.println(stddev(s));
System.out.println(stddev(t));
System.out.println(stddev(u));
System.out.println(stddev(v));

}
}
