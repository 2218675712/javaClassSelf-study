/*
 * 时间:2019年11月6日22:01:54
 * 目的:时分秒案例
 * */
package day1106;

public class text01 {

    public static void main(String[] args) {

        //时的循坏
        for (int hour = 0; hour < 24; hour++) {

            //分的循坏
            for (int minutes = 0; minutes < 60; minutes++) {

                //秒的循坏
                for (int seconds = 0; seconds < 60; seconds++) {

                    if (hour == 6) {
                        System.out.println(hour + "时" + minutes + "分" + seconds + "秒");
                        continue;
                    }
                }

            }

        }

    }
}


