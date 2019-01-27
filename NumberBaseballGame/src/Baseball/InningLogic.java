package Baseball;
import java.util.*;
public class InningLogic {
	static int inning;
	static int numofPlayer;
	static int whatBall;//�� �� �������� ����
	static String compare1 = null;
	static String compare2 = null;
	static Vector<Integer> player1 = new Vector<Integer>(); // vector�� ���� �Է� �� ������� 0������ �Էµȴ�. �״��� �Է� �� ���� 1���̴�.
	static Vector<Integer> player2 = new Vector<Integer>();
	static Vector<Integer> player1Input = new Vector<Integer>();//player�� �����Ͽ� �Է��� ���ڸ� �����ϴ� ����  �ѹ� �Է��� ���� 
	static Vector<Integer> player2Input = new Vector<Integer>();//�ʱ� ���ڿ� �� �Ŀ��� clear�� ����Ͽ� ��� �����Ѵ�.
	static Vector<Integer> randomVector = new Vector<Integer>();//���� ��� �� ��ǻ���� �ʱ� ���ڸ� ������ ���ڷ� ä�� ����

	//�� �� ���������� �����ϴ� �޼ҵ�
	public static void setWhatBall(int whatball){

		//���� ��弱��â���� button1�̳� button3�� ������
		whatBall=whatball;
		//���� ��弱��â���� button2�� button4�� ������
		//whatBall=4;
	}
	//�ִ� �̴� ���� �����ϴ� �޼ҵ�
	public static void setInning(){
		if(whatBall==3)
			inning = 9; //�ִ� 9ȸ�� ����.
		else if(whatBall==4)
			inning = 12;//���� ��弱��â���� button2�̳� button4�� ������
	}

	public static void setRandomVector(){//���� ��带 �Ҷ� ���� ���Ϳ� �������� ���ڸ� �߰��Ѵ�.
		int a;
		while(randomVector.size()!=whatBall){
			if(!randomVector.contains(a=(int)(Math.random()*10)))
				randomVector.add(a);
		}
	}
	public static void resetRandomVector(Vector <Integer> v){//���θ�带 �ϴٰ� Ȩ���� ��ư�� ������ �� ó������ ���ư��� ���������� ���� ��� ����� �޼ҵ�
		v.clear();
	}
	//�� �÷��̾ �ʱ� ���ڸ� �Է��ϴµ� ����ϴ� �޼ҵ�
	public static void setSecret1(int input){

		player1.add(input);

	}

	public static void setSecret2(int input){

		player2.add(input);

	}

	//�� �÷��̰� 
	public static void InputPlayer1(int input){

		player1Input.add(input);
	}

	public static void InputPlayer2(int input){

		player2Input.add(input);
	}

	public static void deleteInputSingle3(Vector <Integer> v){ // ���� �� �Է��� ���ڸ� ���� �� ������ ���� ���� �� ���

		v.removeElementAt(Single3.inputCount);//ex)�������� �Է��� �� ���ﶧ inputCount�� 3�ε� �츮�� 2�� �ε����� ���� �������ϰ� inputCount�� ���� 1 ���� ���Ѿ� ���Ӱ� ���� �Է� �� �� �����Ƿ�
                                            //�� Ŭ������ static����� inputCount�� �����ؾ� �ϹǷ�
	}
	public static void deleteInputSingle4(Vector <Integer> v){ // ���� �� �Է��� ���ڸ� ���� �� ������ ���� ���� �� ���

		v.removeElementAt(Single4.inputCount);//ex)�������� �Է��� �� ���ﶧ inputCount�� 3�ε� �츮�� 2�� �ε����� ���� �������ϰ� inputCount�� ���� 1 ���� ���Ѿ� ���Ӱ� ���� �Է� �� �� �����Ƿ�
                                            //�� Ŭ������ static����� inputCount�� �����ؾ� �ϹǷ�
	}
	public static void deleteInputBoth3(Vector <Integer> v){ // ���� �� �Է��� ���ڸ� ���� �� ������ ���� ���� �� ���

		v.removeElementAt(Both3.inputCount);//ex)�������� �Է��� �� ���ﶧ inputCount�� 3�ε� �츮�� 2�� �ε����� ���� �������ϰ� inputCount�� ���� 1 ���� ���Ѿ� ���Ӱ� ���� �Է� �� �� �����Ƿ�
                                            //�� Ŭ������ static����� inputCount�� �����ؾ� �ϹǷ�
	}
	public static void deleteInputBoth4(Vector <Integer> v){ // ���� �� �Է��� ���ڸ� ���� �� ������ ���� ���� �� ���

		v.removeElementAt(Both4.inputCount);//ex)�������� �Է��� �� ���ﶧ inputCount�� 3�ε� �츮�� 2�� �ε����� ���� �������ϰ� inputCount�� ���� 1 ���� ���Ѿ� ���Ӱ� ���� �Է� �� �� �����Ƿ�
                                            //�� Ŭ������ static����� inputCount�� �����ؾ� �ϹǷ�
	}
	
	public static void deleteAllInput(Vector <Integer> v){ // ���� �� �Է��� ���ڸ� ���� �� ������ ���� ���� �� ���

		v.clear();//ex)�������� �Է��� �� ���ﶧ inputCount�� 3�ε� �츮�� 2�� �ε����� ���� �������ϰ� inputCount�� ���� 1 ���� ���Ѿ� ���Ӱ� ���� �Է� �� �� �����Ƿ�

	}



	//������ �����ϴ� ���ڸ� player1�� �Է¹޾� ó���� �Է��� ����� ������ ��
	public static String compareNum1(int a, int b, int c){
		//�Է� ���� ���ڸ� �迭�� �ְ� ������������ sorting�ϰ� player�� ���� ���ڵ� �迭�� �־ �Ȱ��� sorting �Ѵ�.
		//�׷��� �� �� �� �ε��� ���� �� �ؼ� ������ count�� ++�Ѵ�. ���⼭ �������� count�� ball�� ������ �ȴ�.
		//������ ���⿡�� strike�� ���ԵǾ� �����Ƿ� �Ʒ��� ���ǹ����� strike�������� count�� ������ ���ָ� ball�� ������ �ȴ�.
		
		
		int temp1[] = new int[whatBall];
		temp1[0]=a;
		temp1[1]=b;
		temp1[2]=c;

		int temp2[] = new int[whatBall];
		for(int i=0;i<whatBall;i++)
			temp2[i]=player1.elementAt(i);


		int count=0;
		for(int i=0;i<whatBall;i++)
			for(int j=0;j<whatBall;j++)
				if(temp1[i]==temp2[j])
					count++;

		//3strike
		if((a==player1.elementAt(0))&&(b==player1.elementAt(1))&&(c==player1.elementAt(2)))
			return whatBall+"S"+(count-whatBall)+"B";
		//2stirke
		if((a==player1.elementAt(0))&&(b==player1.elementAt(1))&&(c!=player1.elementAt(2)))
			return (whatBall-1)+"S"+(count-(whatBall-1))+"B";
		if((a==player1.elementAt(0))&&(b!=player1.elementAt(1))&&(c==player1.elementAt(2)))
			return (whatBall-1)+"S"+(count-(whatBall-1))+"B";
		if((a!=player1.elementAt(0))&&(b==player1.elementAt(1))&&(c==player1.elementAt(2)))
			return (whatBall-1)+"S"+(count-(whatBall-1))+"B";

		if((a==player1.elementAt(0))&&(b!=player1.elementAt(1))&&(c!=player1.elementAt(2)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";
		if((a!=player1.elementAt(0))&&(b==player1.elementAt(1))&&(c!=player1.elementAt(2)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";
		if((a!=player1.elementAt(0))&&(b!=player1.elementAt(1))&&(c==player1.elementAt(2)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";

		
			return (whatBall-3)+"S"+(count-(whatBall-3))+"B";//if((a!=player1.elementAt(0))&&(b!=player1.elementAt(1))&&(c!=player1.elementAt(2)))




	}
	//Both4���� �񱳽� ���
	public static String compareNum1_4(int a,int b,int c, int d){
		int temp1[] = new int[whatBall];
		temp1[0]=a;
		temp1[1]=b;
		temp1[2]=c;
		temp1[3]=d;

		int temp2[] = new int[whatBall];
		for(int i=0;i<whatBall;i++)
			temp2[i]=player1.elementAt(i);


		int count=0;
		for(int i=0;i<whatBall;i++)
			for(int j=0;j<whatBall;j++)
				if(temp1[i]==temp2[j])
					count++;

		//4strike
		if((a==player1.elementAt(0))&&(b==player1.elementAt(1))&&(c==player1.elementAt(2))&&(d==player1.elementAt(3)))
			return whatBall+"S"+(count-whatBall)+"B";
		//3stirke
		if((a==player1.elementAt(0))&&(b==player1.elementAt(1))&&(c==player1.elementAt(2))&&(d!=player1.elementAt(3)))
			return (whatBall-1)+"S"+(count-(whatBall-1))+"B";
		if((a==player1.elementAt(0))&&(b==player1.elementAt(1))&&(c!=player1.elementAt(2))&&(d==player1.elementAt(3)))
			return (whatBall-1)+"S"+(count-(whatBall-1))+"B";
		if((a==player1.elementAt(0))&&(b!=player1.elementAt(1))&&(c==player1.elementAt(2))&&(d==player1.elementAt(3)))
			return (whatBall-1)+"S"+(count-(whatBall-1))+"B";
		if((a!=player1.elementAt(0))&&(b==player1.elementAt(1))&&(c==player1.elementAt(2))&&(d==player1.elementAt(3)))
			return (whatBall-1)+"S"+(count-(whatBall-1))+"B";
        //2strike
		if((a==player1.elementAt(0))&&(b==player1.elementAt(1))&&(c!=player1.elementAt(2))&&(d!=player1.elementAt(3)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";
		if((a==player1.elementAt(0))&&(b!=player1.elementAt(1))&&(c==player1.elementAt(2))&&(d!=player1.elementAt(3)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";
		if((a!=player1.elementAt(0))&&(b==player1.elementAt(1))&&(c==player1.elementAt(2))&&(d!=player1.elementAt(3)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";
		if((a!=player1.elementAt(0))&&(b==player1.elementAt(1))&&(c!=player1.elementAt(2))&&(d==player1.elementAt(3)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";
		if((a==player1.elementAt(0))&&(b!=player1.elementAt(1))&&(c!=player1.elementAt(2))&&(d==player1.elementAt(3)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";
		if((a!=player1.elementAt(0))&&(b!=player1.elementAt(1))&&(c==player1.elementAt(2))&&(d==player1.elementAt(3)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";
		//1strike
		if((a==player1.elementAt(0))&&(b!=player1.elementAt(1))&&(c!=player1.elementAt(2))&&(d!=player1.elementAt(3)))
			return (whatBall-3)+"S"+(count-(whatBall-3))+"B";
		if((a!=player1.elementAt(0))&&(b==player1.elementAt(1))&&(c!=player1.elementAt(2))&&(d!=player1.elementAt(3)))
			return (whatBall-3)+"S"+(count-(whatBall-3))+"B";
		if((a!=player1.elementAt(0))&&(b!=player1.elementAt(1))&&(c==player1.elementAt(2))&&(d!=player1.elementAt(3)))
			return (whatBall-3)+"S"+(count-(whatBall-3))+"B";
		if((a!=player1.elementAt(0))&&(b!=player1.elementAt(1))&&(c!=player1.elementAt(2))&&(d==player1.elementAt(3)))
			return (whatBall-3)+"S"+(count-(whatBall-3))+"B";
		
			return (whatBall-4)+"S"+(count-(whatBall-4))+"B";
		
	} 

	//������ �����ϴ� ���ڸ� player1�� �Է¹޾� ó���� �Է��� ����� ������ ��
	public static String compareNum2(int a, int b, int c){
		int temp1[] = new int[whatBall];
		temp1[0]=a;
		temp1[1]=b;
		temp1[2]=c;

		int temp2[] = new int[whatBall];
		for(int i=0;i<whatBall;i++)
			temp2[i]=player2.elementAt(i);


		int count=0;
		for(int i=0;i<whatBall;i++)
			for(int j=0;j<whatBall;j++)
				if(temp1[i]==temp2[j])
					count++;

		//3strike
		if((a==player2.elementAt(0))&&(b==player2.elementAt(1))&&(c==player2.elementAt(2)))
			return whatBall+"S"+(count-whatBall)+"B";
		//2stirke
		if((a==player2.elementAt(0))&&(b==player2.elementAt(1))&&(c!=player2.elementAt(2)))
			return (whatBall-1)+"S"+(count-(whatBall-1))+"B";
		if((a==player2.elementAt(0))&&(b!=player2.elementAt(1))&&(c==player2.elementAt(2)))
			return (whatBall-1)+"S"+(count-(whatBall-1))+"B";
		if((a!=player2.elementAt(0))&&(b==player2.elementAt(1))&&(c==player2.elementAt(2)))
			return (whatBall-1)+"S"+(count-(whatBall-1))+"B";

		if((a==player2.elementAt(0))&&(b!=player2.elementAt(1))&&(c!=player2.elementAt(2)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";
		if((a!=player2.elementAt(0))&&(b==player2.elementAt(1))&&(c!=player2.elementAt(2)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";
		if((a!=player2.elementAt(0))&&(b!=player2.elementAt(1))&&(c==player2.elementAt(2)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";

		
			return (whatBall-3)+"S"+(count-(whatBall-3))+"B";//if((a!=player2.elementAt(0))&&(b!=player2.elementAt(1))&&(c!=player2.elementAt(2)))

	}
	//Both4���� �񱳽� ���
	public static String compareNum2_4(int a,int b,int c, int d){
		int temp1[] = new int[whatBall];
		temp1[0]=a;
		temp1[1]=b;
		temp1[2]=c;
		temp1[3]=d;

		int temp2[] = new int[whatBall];
		for(int i=0;i<whatBall;i++)
			temp2[i]=player2.elementAt(i);


		int count=0;
		for(int i=0;i<whatBall;i++)
			for(int j=0;j<whatBall;j++)
				if(temp1[i]==temp2[j])
					count++;

		//4strike
		if((a==player2.elementAt(0))&&(b==player2.elementAt(1))&&(c==player2.elementAt(2))&&(d==player2.elementAt(3)))
			return whatBall+"S"+(count-whatBall)+"B";
		//3stirke
		if((a==player2.elementAt(0))&&(b==player2.elementAt(1))&&(c==player2.elementAt(2))&&(d!=player2.elementAt(3)))
			return (whatBall-1)+"S"+(count-(whatBall-1))+"B";
		if((a==player2.elementAt(0))&&(b==player2.elementAt(1))&&(c!=player2.elementAt(2))&&(d==player2.elementAt(3)))
			return (whatBall-1)+"S"+(count-(whatBall-1))+"B";
		if((a==player2.elementAt(0))&&(b!=player2.elementAt(1))&&(c==player2.elementAt(2))&&(d==player2.elementAt(3)))
			return (whatBall-1)+"S"+(count-(whatBall-1))+"B";
		if((a!=player2.elementAt(0))&&(b==player2.elementAt(1))&&(c==player2.elementAt(2))&&(d==player2.elementAt(3)))
			return (whatBall-1)+"S"+(count-(whatBall-1))+"B";
        //2strike
		if((a==player2.elementAt(0))&&(b==player2.elementAt(1))&&(c!=player2.elementAt(2))&&(d!=player2.elementAt(3)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";
		if((a==player2.elementAt(0))&&(b!=player2.elementAt(1))&&(c==player2.elementAt(2))&&(d!=player2.elementAt(3)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";
		if((a!=player2.elementAt(0))&&(b==player2.elementAt(1))&&(c==player2.elementAt(2))&&(d!=player2.elementAt(3)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";
		if((a!=player2.elementAt(0))&&(b==player2.elementAt(1))&&(c!=player2.elementAt(2))&&(d==player2.elementAt(3)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";
		if((a==player2.elementAt(0))&&(b!=player2.elementAt(1))&&(c!=player2.elementAt(2))&&(d==player2.elementAt(3)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";
		if((a!=player2.elementAt(0))&&(b!=player2.elementAt(1))&&(c==player2.elementAt(2))&&(d==player2.elementAt(3)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";
		//1strike
		if((a==player2.elementAt(0))&&(b!=player2.elementAt(1))&&(c!=player2.elementAt(2))&&(d!=player2.elementAt(3)))
			return (whatBall-3)+"S"+(count-(whatBall-3))+"B";
		if((a!=player2.elementAt(0))&&(b==player2.elementAt(1))&&(c!=player2.elementAt(2))&&(d!=player2.elementAt(3)))
			return (whatBall-3)+"S"+(count-(whatBall-3))+"B";
		if((a!=player2.elementAt(0))&&(b!=player2.elementAt(1))&&(c==player2.elementAt(2))&&(d!=player2.elementAt(3)))
			return (whatBall-3)+"S"+(count-(whatBall-3))+"B";
		if((a!=player2.elementAt(0))&&(b!=player2.elementAt(1))&&(c!=player2.elementAt(2))&&(d==player2.elementAt(3)))
			return (whatBall-3)+"S"+(count-(whatBall-3))+"B";
		
			return (whatBall-4)+"S"+(count-(whatBall-4))+"B";
		
	}
	
	public static String singleCompareNum3(int a, int b, int c){//Single3���� ������ ������ ��� return
		int temp1[] = new int[whatBall];
		temp1[0]=a;
		temp1[1]=b;
		temp1[2]=c;

		int temp2[] = new int[whatBall];
		for(int i=0;i<whatBall;i++)
			temp2[i]=randomVector.elementAt(i);


		int count=0;
		for(int i=0;i<whatBall;i++)
			for(int j=0;j<whatBall;j++)
				if(temp1[i]==temp2[j])
					count++;

		//3strike
		if((a==randomVector.elementAt(0))&&(b==randomVector.elementAt(1))&&(c==randomVector.elementAt(2)))
			return whatBall+"S"+(count-whatBall)+"B";
		//2stirke
		if((a==randomVector.elementAt(0))&&(b==randomVector.elementAt(1))&&(c!=randomVector.elementAt(2)))
			return (whatBall-1)+"S"+(count-(whatBall-1))+"B";
		if((a==randomVector.elementAt(0))&&(b!=randomVector.elementAt(1))&&(c==randomVector.elementAt(2)))
			return (whatBall-1)+"S"+(count-(whatBall-1))+"B";
		if((a!=randomVector.elementAt(0))&&(b==randomVector.elementAt(1))&&(c==randomVector.elementAt(2)))
			return (whatBall-1)+"S"+(count-(whatBall-1))+"B";

		if((a==randomVector.elementAt(0))&&(b!=randomVector.elementAt(1))&&(c!=randomVector.elementAt(2)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";
		if((a!=randomVector.elementAt(0))&&(b==randomVector.elementAt(1))&&(c!=randomVector.elementAt(2)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";
		if((a!=randomVector.elementAt(0))&&(b!=randomVector.elementAt(1))&&(c==randomVector.elementAt(2)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";

		
			return (whatBall-3)+"S"+(count-(whatBall-3))+"B";//if((a!=randomVector.elementAt(0))&&(b!=randomVector.elementAt(1))&&(c!=randomVector.elementAt(2)))

	}
	public static String singleCompareNum4(int a,int b,int c, int d){//single4���� ������ ������ ��� ���
		int temp1[] = new int[whatBall];
		temp1[0]=a;
		temp1[1]=b;
		temp1[2]=c;
		temp1[3]=d;

		int temp2[] = new int[whatBall];
		for(int i=0;i<whatBall;i++)
			temp2[i]=randomVector.elementAt(i);


		int count=0;
		for(int i=0;i<whatBall;i++)
			for(int j=0;j<whatBall;j++)
				if(temp1[i]==temp2[j])
					count++;

		//4strike
		if((a==randomVector.elementAt(0))&&(b==randomVector.elementAt(1))&&(c==randomVector.elementAt(2))&&(d==randomVector.elementAt(3)))
			return whatBall+"S"+(count-whatBall)+"B";
		//3stirke
		if((a==randomVector.elementAt(0))&&(b==randomVector.elementAt(1))&&(c==randomVector.elementAt(2))&&(d!=randomVector.elementAt(3)))
			return (whatBall-1)+"S"+(count-(whatBall-1))+"B";
		if((a==randomVector.elementAt(0))&&(b==randomVector.elementAt(1))&&(c!=randomVector.elementAt(2))&&(d==randomVector.elementAt(3)))
			return (whatBall-1)+"S"+(count-(whatBall-1))+"B";
		if((a==randomVector.elementAt(0))&&(b!=randomVector.elementAt(1))&&(c==randomVector.elementAt(2))&&(d==randomVector.elementAt(3)))
			return (whatBall-1)+"S"+(count-(whatBall-1))+"B";
		if((a!=randomVector.elementAt(0))&&(b==randomVector.elementAt(1))&&(c==randomVector.elementAt(2))&&(d==randomVector.elementAt(3)))
			return (whatBall-1)+"S"+(count-(whatBall-1))+"B";
        //2strike
		if((a==randomVector.elementAt(0))&&(b==randomVector.elementAt(1))&&(c!=randomVector.elementAt(2))&&(d!=randomVector.elementAt(3)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";
		if((a==randomVector.elementAt(0))&&(b!=randomVector.elementAt(1))&&(c==randomVector.elementAt(2))&&(d!=randomVector.elementAt(3)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";
		if((a!=randomVector.elementAt(0))&&(b==randomVector.elementAt(1))&&(c==randomVector.elementAt(2))&&(d!=randomVector.elementAt(3)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";
		if((a!=randomVector.elementAt(0))&&(b==randomVector.elementAt(1))&&(c!=randomVector.elementAt(2))&&(d==randomVector.elementAt(3)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";
		if((a==randomVector.elementAt(0))&&(b!=randomVector.elementAt(1))&&(c!=randomVector.elementAt(2))&&(d==randomVector.elementAt(3)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";
		if((a!=randomVector.elementAt(0))&&(b!=randomVector.elementAt(1))&&(c==randomVector.elementAt(2))&&(d==randomVector.elementAt(3)))
			return (whatBall-2)+"S"+(count-(whatBall-2))+"B";
		//1strike
		if((a==randomVector.elementAt(0))&&(b!=randomVector.elementAt(1))&&(c!=randomVector.elementAt(2))&&(d!=randomVector.elementAt(3)))
			return (whatBall-3)+"S"+(count-(whatBall-3))+"B";
		if((a!=randomVector.elementAt(0))&&(b==randomVector.elementAt(1))&&(c!=randomVector.elementAt(2))&&(d!=randomVector.elementAt(3)))
			return (whatBall-3)+"S"+(count-(whatBall-3))+"B";
		if((a!=randomVector.elementAt(0))&&(b!=randomVector.elementAt(1))&&(c==randomVector.elementAt(2))&&(d!=randomVector.elementAt(3)))
			return (whatBall-3)+"S"+(count-(whatBall-3))+"B";
		if((a!=randomVector.elementAt(0))&&(b!=randomVector.elementAt(1))&&(c!=randomVector.elementAt(2))&&(d==randomVector.elementAt(3)))
			return (whatBall-3)+"S"+(count-(whatBall-3))+"B";
		
			return (whatBall-4)+"S"+(count-(whatBall-4))+"B";
		
	}
}


