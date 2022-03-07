package school.datastructure;

class Stack{
    int top=-1;
    static String[] data = new String[10];

    public boolean isEmpty(){
        return (top==-1);
    }
    public void push(String item){
        data[++top]=item;
    }
    public String pop(){
        if (isEmpty()) {
            System.out.println("fail");
            return "0";
        }else {
            String item = data[top];
            data[top--] = null;
            return item;
        }
    }
    public void printList(){
        for (int i = 0; i < data.length; i++) {
        System.out.print(data[i]+" ");
        }
    }
}
class StackTest {
    private String exp;

    public String evalPostfix(String postfix){        //3*5-6/2
        Stack S = new Stack();
        exp = postfix;              //35*62/-
        int opr1, opr2, value;
        char testCh;
        for(int i=0; i<7; i++){
            testCh = exp.charAt(i);
            if(testCh !='+' && testCh != '-' && testCh != '*' && testCh != '/'){
                value = testCh - '0';
                System.out.println(value);
                S.push(""+value);
            } else{
                opr2 = Integer.parseInt(S.pop());
                opr1 = Integer.parseInt(S.pop());
                switch (testCh) {
                    case '+':
                        S.push(String.valueOf(opr1 + opr2));
                        break;
                    case '-':
                        S.push(String.valueOf(opr1 - opr2));
                        break;
                    case '*':
                        S.push(String.valueOf(opr1 * opr2));
                        break;
                    case '/':
                        S.push(String.valueOf(opr1 / opr2));
                        break;
                }
            }
        }
        return S.pop();
    }
}

public class 이지석_1701209_2 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("3");
        stack.printList();
        stack.pop();
        System.out.println();
        stack.printList();

        StackTest a = new StackTest();
        String result;
//        String exp = "((3*5)-(6/2))";
        String exp = "35*62/-";
        System.out.printf("\n후위표기식 : %s", exp);
        System.out.println();
        result = a.evalPostfix(exp);
        System.out.printf("\n 연산결과 = %s \n", result);
    }
}