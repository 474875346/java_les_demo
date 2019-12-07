package com.zeroten.flow;

import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        IfElseTest VC = new IfElseTest();
//        VC.testIfElse();
//        VC.testSwitch();
        VC.test2();
    }

    public void testIfElse() {
        /*
          下面我们来做一个示例：给定一个年龄，然后判断该年龄属于儿童、青年、中年还是老年；年龄使用 int 类型，只支持整数。年龄段的划分规则如下：

        年龄范围	描述
        0 ~ 6岁	儿童
        7 ~ 17岁	少年
        18 ~ 40岁	青年
        41 ~ 59岁	中年
        60及以上
         */
        System.out.println("请输入一个年龄:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a < 7) {
            System.out.println("儿童");
        } else if (a < 18) {
            System.out.println("少年");
        } else if (a < 41) {
            System.out.println("青年");
        } else if (a < 60) {
            System.out.println("中年");
        } else {
            System.out.println("老年");
        }
    }

    @Test
    public void testWhile() {
        // 随机生成一个 0 ～ 1000 范围的整数，如果不能被30整除，则打印出数字，如果能被30整除则退出循环。
        // 生成 0 ~ 1000 范围的整数使用语句 int r = new Random().nextInt(1000)。
        boolean isWhile = true;
        int page = 0;
        while (isWhile) {
            int r = new Random().nextInt(1000);
            if (r % 30 == 0) {
                isWhile = false;
                System.out.println("循环了" + page + "次,退出循环");
            } else {
                page++;
                System.out.println(r);
            }
        }
    }

    @Test
    public void testDoWhile() {
        //和 while 部分的练习一样，随机生成一个 0 ～ 1000 范围的整数，
        // 如果不能被30整除，则打印出数字，如果能被30整除则退出循环。
        boolean isWhile = true;
        int page = 0;
        do {
            int r = new Random().nextInt(1000);
            if (r % 30 == 0) {
                isWhile = false;
                System.out.println("循环了" + page + "次,退出循环");
            } else {
                page++;
                System.out.println(r);
            }
        } while (isWhile);
    }

    @Test
    public void testFor() {
        // 打印 0 ~ 100 范围内的单数并计算范围内单数的总个数。
        int page = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 1) {
                page++;
                System.out.println("单数：" + i);
            }
        }
        System.out.println("0 ~ 100之间的单数总个数是：" + page + "个");
    }

    public void testSwitch() {
        /*
        * 假如你有一个机器人，你通过输入数字指令来指挥机器人，比如输入 1 让机器人扫地，输入 2 让机器人打开灯。具体指令如下：

        数字指令	执行命令
        1	扫地
        2	开灯
        3	关灯
        4	播放音乐
        5	关闭音乐
        其他数字	不能识别的指令
        * */

        System.out.println("请输入一个指令:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        switch (a) {
            case 1: {
                System.out.println("扫地");
            }
            break;
            case 2: {
                System.out.println("开灯");
            }
            break;
            case 3: {
                System.out.println("关灯");
            }
            break;
            case 4: {
                System.out.println("播放音乐");
            }
            break;
            case 5: {
                System.out.println("关闭音乐");
            }
            break;
            default: {
                System.out.println("无法识别指令");
            }
            break;
        }
    }

    @Test
    public void test1() {
        // 还是前边的练习，我们来改写一下。随机生成一个 0 ～ 1000 范围的整数，
        // 如果不能被30整除，则打印出数字，如果能被30整除则退出循环。
        boolean isWhile = true;
        int page = 0;
        while (isWhile) {
            int r = new Random().nextInt(1000);
            if (r % 30 == 0) {
                System.out.println("循环了" + page + "次,退出循环");
                break;
            } else {
                page++;
                System.out.println(r);
            }
        }
    }


    public void test2() {
        // 编写一个方法 int getMaxNumRem7(int n1, int n2)
        // 找出 0 ~ n2 范围内除以 n1 余 7 的最大的数，找到则返回该数，如果找不到则返回 -1。
        System.out.println("请输入一个整数n1:");
        Scanner input1 = new Scanner(System.in);
        int n1 = input1.nextInt();
        System.out.println("请输入一个整数n2:");
        Scanner input2 = new Scanner(System.in);
        int n2 = input2.nextInt();
        System.out.println(getMaxNumRem7(n1, n2));
    }

    public static int getMaxNumRem7(int n1, int n2) {
        for (int i = 0; i < n2; i++) {
            if (i % n1 == 7) {
                return i;
            }
        }
        return -1;
    }

    @Test
    public void test3() {
//        找出 0 ~ 100 范围内能被7整除的数，并计算它们累计相加的结果。
        int total = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 7 == 0) {
                total += i;
            }
        }
        System.out.println("累加结果：" + total);
    }

    @Test
    public void testVampireNumber() {
        /**
         * 找出四位数的所有吸血鬼数字
         * 吸血鬼数字是指位数为偶数的数字，可以由一对数字相乘而得到，而这对数字各包含乘积的一半位数的数字，
         * 其中从最初的数字中选取的数字可以任意排序.
         * 例如下列数字都是吸血鬼数字
         *     1260=21*60
         *     1827=21*87
         *     2187=27*81
         */
        int sum = 0;
        int[] startList = new int[4];
        int[] productList = new int[4];
        for (int i = 10; i < 100; i++) {
            for (int j = 10; j < 100; j++) {
                int product = i * j;
                if (product > 999 && product < 10000) {
                    // i的十位
                    startList[0] = i / 10;
                    // i的个位
                    startList[1] = i % 10;
                    // j的十位
                    startList[2] = j / 10;
                    // j的个位
                    startList[3] = j % 10;
                    // 总和千位
                    productList[0] = product / 1000;
                    // 总和百位
                    productList[1] = (product % 1000) / 100;
                    // 总和十位
                    productList[2] = product % 1000 % 100 / 10;
                    // 总和个位
                    productList[3] = product % 1000 % 100 % 10;
                    int count = 0;
                    for (int x = 0; x < 4; x++) {
                        for (int y = 0; y < 4; y++) {
                            if (startList[x] == productList[y]){
                                count++;
                                startList[x] = -1;
                                productList[y] = -2;
                                if (count == 4) {
                                    sum++;
                                    System.out.println("第" + sum + "组: " + i + " * " + j + " : " + product);
                                }
                            }
                        }
                    }


                }
            }
        }

    }
}
