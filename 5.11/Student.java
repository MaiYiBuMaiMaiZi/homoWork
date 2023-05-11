public class Student {
    private int age;
    private int num;
    private String name;
    private String born;
    private String career;
    private String sex;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getBorn() {
        return born;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getCareer() {
        return career;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void display(Student xiaoMing) {
        if (sex.equals("男") && age == 24 && born.equals("1919.8.10") && career.equals("学生")) {
            System.out.println("错误，请重新输入");
        } else {
            System.out.println("姓名:" + name + " 年龄:" + age + " 性别:" + sex + " 职位:" + career + " 出生日期:" + born);
        }
    }

}
