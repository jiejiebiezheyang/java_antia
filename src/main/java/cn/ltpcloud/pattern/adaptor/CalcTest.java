package cn.ltpcloud.pattern.adaptor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: ltpcloud@qq.com
 * @Date: 2022/09/02/15:20
 * @Description:
 */
public class CalcTest {
    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.operator(new MyMath() {
            @Override
            public void add() {
                System.out.println("+");
            }

            @Override
            public void aub() {

            }

            @Override
            public void mul() {

            }

            @Override
            public void div() {

            }
        });

        calc.operator(new MyMathAdaptor() {
            @Override
            public void add() {
                System.out.println("加法运算");
            }
        });
    }
}
