package project.p;
import java.util.*;

class Data{
	int no;       // Student Roll No
	String name;     // Student Name
	double f;         // fees
	int disfees;      // if student get more then 75 per then discont fees
	float per;      //Percentage
	int m;         // total subject Marks : 
	int e;           // English
	int mx;         // Maths
	int s;         //Science
	int ss;        // social science
	int ma;        //Marathi
	public int getDisfees() {
		return disfees;
	}
	public void setDisfees(int disfees) {
		this.disfees = disfees;
	}
	public double getF() {
		return f;
	}
	public void setF(double f) {
		this.f = f;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	
	public void setPer(float per) {
		this.per=per;
	}
	public float getPer() {
		return per;
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	public int getMx() {
		return mx;
	}
	public void setMx(int mx) {
		this.mx = mx;
	}
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	public int getSs() {
		return ss;
	}
	public void setSs(int ss) {
		this.ss = ss;
	}
	
	
}
class Topper{
	Data d[];
	float max;
	int mar;
	int en;
	int sls;
	int sci;
	int math;
	void setData(Data ...d) {
		this.d=d;
	}
	void showTopper() {
		max=d[0].getPer();
		for(int i=0;i<d.length;i++) {
			if(d[i].getPer()>max && d[i].getMa()>35 && d[i].getE()>35 && d[i].getS()>35 && d[i].getMx()>35 && d[i].getSs()>35) {
				max=d[i].getPer();
			}
		}
		System.out.println("\n Topper is");
		for(int i=0;i<d.length;i++) {
	             if(d[i].getPer()==max) {
	            	 
	     System.out.println("\nRoll No   Name       Marathi    English     Social Science     Science        Maths       Total Marks     Percentage"); 			
	     System.out.println(d[i].getNo()+"\t"+d[i].getName()+"\t\t"+d[i].getMa()+"\t"+d[i].getE()+"\t\t"+d[i].getSs()+"\t\t"+d[i].getS()+"\t\t"+d[i].getMx()+"\t\t"+d[i].getM()+"\t\t"+d[i].getPer());
		 			
	             }
	}
	}
	void TopperinMarathi() {
		
			mar=d[0].getMa();
			for(int i=0;i<d.length;i++) {
				if(d[i].getMa()>mar && d[i].getE()>35 && d[i].getS()>35 && d[i].getMx()>35 && d[i].getSs()>35) {
					mar=d[i].getMa();
				}
			}
			System.out.println("\n Topper in Marathi Subject");
			System.out.println("\nRoll No   Name       Marathi    English     Social Science     Science        Maths       Total Marks     Percentage");
			for(int i=0;i<d.length;i++) {
		             if(d[i].getMa()==mar) {
		            	 System.out.println(d[i].getNo()+"\t"+d[i].getName()+"\t\t"+d[i].getMa()+"\t"+d[i].getE()+"\t\t"+d[i].getSs()+"\t\t"+d[i].getS()+"\t\t"+d[i].getMx()+"\t\t"+d[i].getM()+"\t\t"+d[i].getPer());
		 			}
		    
		             }
		}
	void TopperinEnglish() {
		
		en=d[0].getE();
		for(int i=0;i<d.length;i++) {
			if(d[i].getE()>en && d[i].getMa()>35 && d[i].getS()>35 && d[i].getMx()>35 && d[i].getSs()>35) {
				en=d[i].getE();
			}
		}
		System.out.println("\n Topper in Marathi Subject");
		System.out.println("\nRoll No   Name       Marathi    English     Social Science     Science        Maths       Total Marks     Percentage");
		for(int i=0;i<d.length;i++) {
	             if(d[i].getE()==en) {
	            	 System.out.println(d[i].getNo()+"\t"+d[i].getName()+"\t\t"+d[i].getMa()+"\t"+d[i].getE()+"\t\t"+d[i].getSs()+"\t\t"+d[i].getS()+"\t\t"+d[i].getMx()+"\t\t"+d[i].getM()+"\t\t"+d[i].getPer());
	 			}
	             }
	}
	
	void TopperinSocialScience() {
		
		sls=d[0].getSs();
		for(int i=0;i<d.length;i++) {
			if(d[i].getSs()>sls && d[i].getMa()>35 && d[i].getE()>35 && d[i].getS()>35 && d[i].getMx()>35 ) {
				sls=d[i].getSs();
			}
		}
		System.out.println("\n Topper in Social Science Subject");
		System.out.println("\nRoll No   Name       Marathi    English     Social Science     Science        Maths       Total Marks     Percentage");
		for(int i=0;i<d.length;i++) {
	             if(d[i].getSs()==sls) {
	            	 System.out.println(d[i].getNo()+"\t"+d[i].getName()+"\t\t"+d[i].getMa()+"\t"+d[i].getE()+"\t\t"+d[i].getSs()+"\t\t"+d[i].getS()+"\t\t"+d[i].getMx()+"\t\t"+d[i].getM()+"\t\t"+d[i].getPer());
	 			}
	    
	             }
	}
	
   void TopperinScience() {
		sci=d[0].getS();
		for(int i=0;i<d.length;i++) {
			if(d[i].getS()>sci && d[i].getMa()>35 && d[i].getE()>35  && d[i].getMx()>35 && d[i].getSs()>35) {
				sci=d[i].getS();
			}
		}
		System.out.println("\n Topper in Science Subject");
		System.out.println("\nRoll No   Name       Marathi    English     Social Science     Science        Maths       Total Marks     Percentage");
		for(int i=0;i<d.length;i++) {
	             if(d[i].getS()==sci) {
	            	 System.out.println(d[i].getNo()+"\t"+d[i].getName()+"\t\t"+d[i].getMa()+"\t"+d[i].getE()+"\t\t"+d[i].getSs()+"\t\t"+d[i].getS()+"\t\t"+d[i].getMx()+"\t\t"+d[i].getM()+"\t\t"+d[i].getPer());
	 			}
	             }
	      }
   void TopperinMaths() {
		math=d[0].getMx();
		for(int i=0;i<d.length;i++) {
			if(d[i].getMx()>math && d[i].getMa()>35 && d[i].getE()>35 && d[i].getS()>35  && d[i].getSs()>35) {
				math=d[i].getMx();
			}
		}
		System.out.println("\n Topper in Science Subject");
		System.out.println("\nRoll No   Name       Marathi    English     Social Science     Science        Maths       Total Marks     Percentage");
		for(int i=0;i<d.length;i++) {
	             if(d[i].getMx()==math ) {
	            	 System.out.println(d[i].getNo()+"\t"+d[i].getName()+"\t\t"+d[i].getMa()+"\t"+d[i].getE()+"\t\t"+d[i].getSs()+"\t\t"+d[i].getS()+"\t\t"+d[i].getMx()+"\t\t"+d[i].getM()+"\t\t"+d[i].getPer());
	 			}
	             }
	      }

	}

public class StudentInfo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Topper tp=new Topper();
		int ch;
		int r;
		String mn;
		float p;
		int df;
		int ma;
		int e;
		int mx;
		int s;
		int ss;
		int ta;
		
		Data da[]=new Data[1];
		float max;
		Data t;
		int fees;
		fees=1000;
		
		
do {
		System.out.println("\n1 :Enter the All Student Details");
		System.out.println("2 : Display all Infomation");
		System.out.println("3 : check Topper in Marathi");
		System.out.println("4 : check Topper in English");
		System.out.println("5 : check Topper in Social Science");
		System.out.println("6 : check Topper in Science");
		System.out.println("7 : check Topper in Maths");
		System.out.println("8 : check Topper of the Class");
		System.out.println("9 : check Student Grade");
		System.out.println("10:  check Topper of the Class by using per");
		System.out.println("11 : Arrragne Per in Desending Order");
		System.out.println("12 : if student per more than 75 then student will get 30% discont in fees for next year addmission");
		System.out.println("\n Enter the Choice");
		ch=sc.nextInt();
		
	switch(ch)
	{
	   case 1:
		 for(int i=0;i<da.length;i++) {
			 System.out.println("\nEnter the Student Roll Number");
			r=sc.nextInt();
			System.out.println("Enter the Student Name");
			mn=sc.next();
			System.out.println("\n Enter the All Subject Marks");
			System.out.println("Marathi   English   Social Science   Science  Maths");
			ma=sc.nextInt();
			e=sc.nextInt();
			ss=sc.nextInt();
			s=sc.nextInt();
			mx=sc.nextInt();
		    ta=ma+e+mx+s+ss;
		    p=ta/5;			
			
			da[i]=new Data();
			da[i].setNo(r);
			da[i].setName(mn);
			da[i].setMa(ma);   // Marathi
			da[i].setE(e);    //English
			da[i].setSs(ss);    //Social Science
			da[i].setS(s);    //Science
			da[i].setMx(mx);   //maths
			da[i].setM(ta);
			da[i].setPer(p);
			da[i].setF(fees);
			
			

		}
		 break;
	   case 2:
		  
		   System.out.println("\n The Data of All Students");
		   System.out.println("\nRoll No   Name       Marathi    English     Social Science     Science        Maths       Total Marks     Percentage");
			for(int i=0;i<da.length;i++) {
			System.out.println(da[i].getNo()+"\t"+da[i].getName()+"\t\t"+da[i].getMa()+"\t"+da[i].getE()+"\t\t"+da[i].getSs()+"\t\t"+da[i].getS()+"\t\t"+da[i].getMx()+"\t\t"+da[i].getM()+"\t\t"+da[i].getPer());
			}
		   break;
	   case 3:
		   tp.setData(da);
		   tp.TopperinMarathi();
		   
		   break;
	   case 4:
		   tp.setData(da);
		   tp.TopperinEnglish();;
		   break;
	   case 5: 
		   tp.setData(da);
	       tp.TopperinSocialScience();
		   break;
	   case 6:
		   tp.setData(da);
		   tp.TopperinScience();
		   break;
	   case 7:
		   tp.setData(da);
		   tp.TopperinMaths();
		   break;
	   case 8:
		   tp.setData(da);
		   tp.showTopper();
		   break;
	   case 9:
		   System.out.println("\nRoll No   Name       Marathi    English     Social Science     Science        Maths       Total Marks     Percentage");
		   for(int i=0;i<da.length;i++) {
		   if(da[i].getPer()>=75 && da[i].getMa()>35 && da[i].getE()>35 &&da[i].getS()>35 && da[i].getMx()>35 && da[i].getSs()>35) {
			        
			   System.out.println(da[i].getNo()+"\t"+da[i].getName()+"\t\t"+da[i].getMa()+"\t"+da[i].getE()+"\t\t"+da[i].getSs()+"\t\t"+da[i].getS()+"\t\t"+da[i].getMx()+"\t\t"+da[i].getM()+"\t\t"+da[i].getPer());
				System.out.println("\n Destision");
			}
			else if(da[i].getPer()>=60 && da[i].getPer()<=75 && da[i].getMa()>35 && da[i].getE()>35 &&da[i].getS()>35 && da[i].getMx()>35 && da[i].getSs()>35) {
				System.out.println(da[i].getNo()+"\t"+da[i].getName()+"\t\t"+da[i].getMa()+"\t"+da[i].getE()+"\t\t"+da[i].getSs()+"\t\t"+da[i].getS()+"\t\t"+da[i].getMx()+"\t\t"+da[i].getM()+"\t\t"+da[i].getPer());
			    	System.out.println("\n First Class");
			}
			else if(da[i].getPer()>=50 && da[i].getPer()<=60  && da[i].getMa()>35 && da[i].getE()>35 &&da[i].getS()>35 && da[i].getMx()>35 && da[i].getSs()>35) {
				
				System.out.println(da[i].getNo()+"\t"+da[i].getName()+"\t\t"+da[i].getMa()+"\t"+da[i].getE()+"\t\t"+da[i].getSs()+"\t\t"+da[i].getS()+"\t\t"+da[i].getMx()+"\t\t"+da[i].getM()+"\t\t"+da[i].getPer());
				System.out.println("\n Second Class");
			}
			else if(da[i].getPer()>=35 && da[i].getPer()<=49 && da[i].getMa()>35 && da[i].getE()>35 &&da[i].getS()>35 && da[i].getMx()>35 && da[i].getSs()>35) {
			
				System.out.println(da[i].getNo()+"\t"+da[i].getName()+"\t\t"+da[i].getMa()+"\t"+da[i].getE()+"\t\t"+da[i].getSs()+"\t\t"+da[i].getS()+"\t\t"+da[i].getMx()+"\t\t"+da[i].getM()+"\t\t"+da[i].getPer());
				System.out.println("\n Third Class");
			}
			else {
				System.out.println(da[i].getNo()+"\t"+da[i].getName()+"\t\t"+da[i].getMa()+"\t"+da[i].getE()+"\t\t"+da[i].getSs()+"\t\t"+da[i].getS()+"\t\t"+da[i].getMx()+"\t\t"+da[i].getM()+"\t\t"+da[i].getPer());
				System.out.println("\n Fail");
			}
		   
		   }
		   break;
	   case 10 :
		  
		 tp.setData(da);
		 tp.showTopper();
		   break;
	   case 11:
		   for(int i=0;i<da.length;i++) {
			   for(int j=i;j<da.length;j++) {
				   if(da[i].getPer()<da[j].getPer()) {
					   t=da[i];
					    da[i]=da[j];
					    da[j]=t;
					    }
			      }
			   
		   }
		   System.out.println("\nRoll No   Name       Marathi    English     Social Science     Science        Maths       Total Marks     Percentage");
		   for(int i=0;i<da.length;i++) {
				System.out.println(da[i].getNo()+"\t"+da[i].getName()+"\t\t"+da[i].getMa()+"\t"+da[i].getE()+"\t\t"+da[i].getSs()+"\t\t"+da[i].getS()+"\t\t"+da[i].getMx()+"\t\t"+da[i].getM()+"\t\t"+da[i].getPer());
				}
		   
		   break;
	   case 12:
		   df=0;
		   System.out.println("\nRoll No   Name        Total Marks     Percentage     fees");
		   for(int i=0;i<da.length;i++) {
			   if(da[i].getPer()>75) {
			double d = fees-(fees*0.30);
			      df=(int)d;
				  da[i].setDisfees(df);
				  
			      System.out.println(da[i].getNo()+"\t"+da[i].getName()+"\t\t"+da[i].getM()+"\t\t"+da[i].getPer()+"\t\t"+da[i].getDisfees());
			   }
			   else {
				       
					   System.out.println(da[i].getNo()+"\t"+da[i].getName()+"\t\t"+da[i].getM()+"\t\t"+da[i].getPer()+"\t\t"+da[i].getF());
				   }
			   }
		   break;
		   }
	}		

while(ch<13);
	}
}


	


