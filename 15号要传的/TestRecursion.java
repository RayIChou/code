package test;

public class TestRecursion {
	int test(int n){
		if(n==1){
			return 1;
		}else{
			return n*test(n-1);
		}
	}
public static void main(String[] args){
	System.out.println(new TestRecursion().test(1));

int i=5;
int result = 1;
while(i>1){
	result *= i*(i-1);
	i-=2;
}
System.out.println("结果是："+result+"最后i="+i);
System.out.printf("结果是：%d最后i=%d,字符串：%s",result,i,"uuuuu");
}
}


