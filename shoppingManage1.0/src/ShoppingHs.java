public class ShoppingHs extends Pay {
    public void getShoppingHs() {
        shoppingMg.ownGoods.add("可口可乐");
        System.out.println(shoppingMg.ownGoods);//遍历购物车里面的内容
        System.out.println(bought);//遍历购物历史
    }
}
