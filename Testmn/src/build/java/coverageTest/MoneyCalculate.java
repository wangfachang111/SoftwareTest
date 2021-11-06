package coverageTest;

public class MoneyCalculate {
public String moneycalculate(double money) {
int max100 = 0;
int max25 = 0;
int max5 = 0;
int max1 = 0;
String str = String.valueOf(money).trim();
String[] ary = str.split("\\.");
max100 = Integer.parseInt(ary[0]);
if(ary.length == 2)
{
int fen = Integer.parseInt(ary[1]);
if(ary[1].trim().length() == 1)
{
fen = Integer.parseInt(ary[1]) * 10;
}
max25 = fen / 25;
if(fen % 25 != 0)
{
fen = fen % 25;
}else{
fen = 0;
}
max5 = fen / 5;
max1 = fen % 5;
}
StringBuilder sb = new StringBuilder(money + " = ");
if(max100 != 0)
{
sb.append(max100);
sb.append("*1 ");
}
if(max25 != 0)
{
sb.append(" + "+ max25);
sb.append("*0.25 ");
}
if(max5 != 0)
{
sb.append(" + "+max5);
sb.append("*0.05 ");
}
if(max1 != 0)
{
sb.append(" + "+max1);
sb.append("*0.01 ");
}
return sb.toString();
}

public static void main(String[] args) {
	MoneyCalculate mc = new MoneyCalculate();
	System.out.println(mc.moneycalculate(1.6));
	System.out.println(mc.moneycalculate(0.01));
	System.out.println(mc.moneycalculate(1));
}
}
