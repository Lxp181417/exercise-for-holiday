import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformation extends Pay {//记录客户个人信息
    //客户ID、用户名、用户级别（金牌客户、银牌客户、铜牌客户）、用户注册时间、客户累计消费总金额、用户手机号、用户邮箱；
    ArrayList<String> customerGrade = new ArrayList<>();//用户级别
    ArrayList<String> registrationTime = new ArrayList<>();//用户注册时间
    ArrayList<String> customerPhoneNumber = new ArrayList<>();//用户手机号
    ArrayList<String> customerEmail = new ArrayList<>();//用户邮箱
    ArrayList<String> customerID=new ArrayList<>();//用户ID
    //设置用户ID
    public void setCustomerID() {
    try{
        customerID = (ArrayList<String>) customerPhoneNumber.clone();
        System.out.println("ID:"+customerID);
    }catch (NumberFormatException e){
        e.printStackTrace();
    }
    }

    //绑定手机号
    public void bindMobilePhoneNumber() {
        customerPhoneNumber.add("18183923329");//
        System.out.println("请输入您的手机号进行绑定：");
        Scanner phn = new Scanner(System.in);
        String phoneNumber = phn.next();
        if (customerPhoneNumber.contains(phoneNumber)) {
            System.err.println("该号码已经被注册！请换个号码重试");
            bindMobilePhoneNumber();
        } else {
            customerPhoneNumber.add(phoneNumber);
            System.out.println("号码绑定成功");
        }

    }

    //绑定邮箱
    public void bindEmail() {
        customerEmail.add("yun.1923");
        System.out.println("请输入您的邮箱账号进行绑定：");
        Scanner phn = new Scanner(System.in);
        String emailInput = phn.next();
        if (customerPhoneNumber.contains(emailInput)) {
            System.err.println("该号码已经被注册！请换个号码重试");
            bindMobilePhoneNumber();
        } else {
            customerPhoneNumber.add(emailInput);
            System.out.println("号码绑定成功");
        }
    }

    //统计总花销
    public void statisticalConsumptionAmount() {
        super.costTotal.add(total);
        System.out.println("总消费："+costTotal);
    }

    //判断客户级别
    public void grade() {
        people.addCustomer0();
        this.statisticalConsumptionAmount();
        double customerCost = costTotal.get(super.adds);
        //金牌客户、银牌客户、铜牌客户
        if (customerCost >= 0.0 && customerCost < 1000.0) {
            customerGrade.add("铜牌客户");
            System.out.println("客户级别："+customerGrade.get(super.adds));
        }
        if (customerCost >= 1000.0 && customerCost < 5000.0) {
            customerGrade.add("银牌客户");
            System.out.println("客户级别："+customerGrade.get(super.adds));
        }
        if (customerCost >= 5000.0) {
            customerGrade.add("金牌客户");
            System.out.println("客户级别："+customerGrade.get(super.adds));
        }
        if(costTotal.get(super.adds)==null){
            customerGrade.add("铜牌客户");
            System.out.println("客户级别："+customerGrade.get(super.adds));
        }
    }
    //用户注册时间已经在customer类中解决
}

