import java.util.ArrayList;
import java.util.Scanner;

public class Goods {
    //商品的信息包括：商品编号、商品名称、生产厂家、生产日期、型号、进货价、零售价格、数量。所有信息都要相互关联//8要素
    ArrayList<Integer> goodsNumber = new ArrayList<>();//：商品编号
    ArrayList<String> goodsName = new ArrayList<>();//商品名称
    ArrayList<String> goodsManufacturer = new ArrayList<>();//生产厂家
    ArrayList<String> goodsDateOfProduction = new ArrayList<>();//生产日期
    ArrayList<String> goodsTypes = new ArrayList<>();//型号
    ArrayList<Double> goodsImportPrice = new ArrayList<>();//进货价
    ArrayList<Double> goodsExitPrice = new ArrayList<>();//零售价格
    ArrayList<Integer> goodsCount = new ArrayList<>();//数量
    int num = 0;

    //添加商品,现在添加的属于初始化内容主要用于测试使用；
    public void addGoods0() {
        goodsNumber.add(1);
        goodsName.add("可口可乐");
        goodsManufacturer.add("coke");
        goodsDateOfProduction.add("2021.7.19.12:00:03");
        goodsTypes.add("1886");
        goodsImportPrice.add(2.5);
        goodsExitPrice.add(3.0);
        goodsCount.add(500);
    }

    //列出所有商品（这里不列出商品的进货价，进价部分只有管理员可见）
    public void showAllGoods() {
        System.out.println("商品编号：" + goodsNumber);
        System.out.println("商品名：" + goodsName);
        System.out.println("生产商：" + goodsManufacturer);
        System.out.println("生产日期：" + goodsDateOfProduction);
        System.out.println("产品型号：" + goodsTypes);
        System.out.println("零售价：" + goodsExitPrice);
        System.out.println("库存：" + goodsCount);
    }

    //查询商品
    //可以根据商品名称、生产厂家、零售价格进行单独查询或者组合查询
    public void searchGoods() {
        System.out.println("请选择您的查询方式：");
        System.out.println("\t1--商品名或生产厂家查询\n\t2--零售价查询");
        Scanner choose = new Scanner(System.in);
        int choose6 = choose.nextInt();
        switch (choose6) {
            case 1:
                System.out.println("\t1--输入的商品名或生产厂家查询");
                System.out.println("\t2--输入的商品名和生产厂家查询");
                Scanner choose_ = new Scanner(System.in);
                int che = choose_.nextInt();
                switch (che) {
                    case 1:
                        System.out.println("请输入您要搜索商品的商品名或生产厂家：");
                        Scanner sch = new Scanner(System.in);
                        String search = sch.next();
                        if (goodsName.contains(search)) {
                            int site = goodsName.indexOf(search);//定位商品地址
                            System.out.println("商品名：" + search);
                            System.out.println("商品编号：" + goodsNumber.get(site));
                            System.out.println("生产商：" + goodsManufacturer.get(site));
                            System.out.println("生产日期：" + goodsDateOfProduction.get(site));
                            System.out.println("产品型号：" + goodsTypes.get(site));
                            System.out.println("零售价：" + goodsExitPrice.get(site));
                            System.out.println("库存量：" + goodsCount.get(site));
                        } else if (goodsManufacturer.contains(search)) {
                            int site1 = goodsManufacturer.indexOf(search);//定位商品地址
                            System.out.println("商品名：" + goodsName.get(site1));
                            System.out.println("商品编号：" + goodsNumber.get(site1));
                            System.out.println("生产商：" + search);
                            System.out.println("生产日期：" + goodsDateOfProduction.get(site1));
                            System.out.println("产品型号：" + goodsTypes.get(site1));
                            System.out.println("零售价：" + goodsExitPrice.get(site1));
                            System.out.println("库存量：" + goodsCount.get(site1));
                        } else {
                            System.out.println("暂无此商品的任何信息！");
                        }
                        break;
                    case 2://有BUG不能查询出结果
                        System.out.println("请输入您要搜索商品的商品名和生产厂家：");
                        Scanner sch1 = new Scanner(System.in);
                        String search1 = sch1.next();
                        //正则表达分割输入的字符串
                        String[] str = new String[2];
                        str = search1.split("\\s+");
                        String str1 = str[0];
                        String str2 = str[1];
                        if (goodsName.contains(str1) && goodsManufacturer.contains(str2)) {
                            int location = goodsName.indexOf(str1);//定位商品地址
                            System.out.println("商品名：" + goodsName.get(location));
                            System.out.println("商品编号：" + goodsNumber.get(location));
                            System.out.println("生产商：" + goodsManufacturer.get(location));
                            System.out.println("生产日期：" + goodsDateOfProduction.get(location));
                            System.out.println("产品型号：" + goodsTypes.get(location));
                            System.out.println("零售价：" + goodsExitPrice.get(location));
                            System.out.println("库存量：" + goodsCount.get(location));
                        } else if (goodsName.contains(str2) && goodsManufacturer.contains(str1)) {
                            int place = goodsName.indexOf(str2);//定位商品地址
                            System.out.println("商品名：" + goodsName.get(place));
                            System.out.println("商品编号：" + goodsNumber.get(place));
                            System.out.println("生产商：" + goodsManufacturer.get(place));
                            System.out.println("生产日期：" + goodsDateOfProduction.get(place));
                            System.out.println("产品型号：" + goodsTypes.get(place));
                            System.out.println("零售价：" + goodsExitPrice.get(place));
                            System.out.println("库存量：" + goodsCount.get(place));
                        } else {
                            System.out.println("暂无此商品的任何信息！");
                        }
                        break;
                }


                break;
            case 2:
                System.out.println("请输入商品零售价进行查询：");
                Scanner prc = new Scanner(System.in);
                double price = prc.nextDouble();
                if (goodsExitPrice.contains(price)) {
                    int address = goodsExitPrice.indexOf(price);//定位商品
                    System.out.println("商品名：" + goodsName.get(address));
                    System.out.println("商品编号：" + goodsNumber.get(address));
                    System.out.println("生产商：" + goodsManufacturer.get(address));
                    System.out.println("生产日期：" + goodsDateOfProduction.get(address));
                    System.out.println("产品型号：" + goodsTypes.get(address));
                    System.out.println("零售价：" + goodsExitPrice.get(address));
                    System.out.println("库存量：" + goodsCount.get(address));
                } else {
                    System.out.println("暂无此商品的任何信息！");
                }

        }
    }
}
