package abcde;

public class Asr{

    private A[]as=new A[]{};
    class Yillar {
        class FasilQish {
            String decName = "dekabr";
            String yanName = "yanvar";
            String fevName = "fevral";
        }

        class FasilBahor {
            String matName = "mart";
            String aprName = "aprel";
            String mayName = "may";
        }

        public static class FasilYoz {
            String iyunName = "iyun";
            String iyulName = "iyul";
            String avgName = "avgust";
        }

        public static class FasilKuz {
            String senName = "sentabr";
            String oktName = "oktabr";
            String nayName = "nayabr";
        }
    }

    public void main(String[] args) {
        Yillar yillar = new Yillar();
        Yillar.FasilQish fasilQish = yillar.new FasilQish();
//        System.out.println(fasilQish.decName);
//        System.out.println(fasilQish.yanName);
//        System.out.println(fasilQish.fevName);
//
//        Yillar.FasilBahor fasilBahor=yillar.new FasilBahor();
//        System.out.println(fasilBahor.matName);
//        System.out.println(fasilBahor.aprName);
//        System.out.println(fasilBahor.mayName);

        Asr.Yillar.FasilYoz a= new Yillar.FasilYoz();

    }

    public static void showInfo() {
        if (true) {
            class A {
                public A(String name) {
                    class B {
                        String name;

                        void show() {

                        }
                    }

                }
            }
        }

    }

}

