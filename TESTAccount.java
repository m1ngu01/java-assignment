class Account
{
    private static int count;

    /* 고객 번호 */
    private int no;
    /* 고객 이름 */
    private String name;
    /* 잔고 금액 */
    private int money;

    /* 생성자 : 초기화하는 생성자 */
    public Account()
    {
        no = money = 0;   
        name = "";
        System.err.println(++count + " Account create");
    }

    /* 각각 설정하고 가져오는 메소드 */
    public void setInfoNo(int fno)
    {
        no = fno;
    }
    public void setInfoName(String fname)
    {
        name = fname;
    }
    public void setInfoMoney(int fmoney)
    {
        money = fmoney;
    }

    /* 한번에 설정하는 메소드 */
    public void setInfoAll(int fno, String fname, int fmoney)
    {
        no = fno;
        name = fname;
        money = fmoney;
    }

}

class TestAccount
{
    public static void main(String[] args)
    {
        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = new Account();
        Account a4 = new Account();
        Account a5 = new Account();

        Account[] as = new Account[5];
        for(int i = 0; i < as.length; i++)
        {
            as[i] = new Account();
        }

    }
}