class Practice6_2 {
    public static void main(String args[]){
        Student s = new Student("홍길동",1,1,100,60,76);

        String str =s.info();
        System.out.println(str);
    }
}

class Student{

    String name;
    int grade , level , Kor , Eng , Math;
    int sum;
    double average;
    Student(){}

    Student(String n,int g,int l,int k,int e,int m){
        name = n;
        grade = g;
        level = l;
        Kor = k;
        Eng = e;
        Math = m;

    }

    int total(){
        return Kor+Eng+Math;

    }

    float avearge(){
        return (int)(total()/3f+10+0.5f)/10.0f;
    }

    String info(){
        return name+","+grade+","+level+","+Kor+","+Eng+","+Math+","+total()+","+avearge();
    }

}