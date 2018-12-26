package com.example.thiti.al;

public class Question {
    public String mQuestion[] = {
            "1.สัตว์ในรูปนี้คืออะไร",
            "2.เคยเห็นรูปนี้หรือไม่?",
            "3.เกสรของดอกในรูปนี้สีอะไร?",
            "4.คุณเคยเห็นรูปนี้หรือไม่?",
            "5.สัตว์ในรูปนี้คืออะไร?",
    };

    private  String mChoice[][] = {
            {"ม้า", "แมว", "กระต่าย","หนู"},
            {"เคย", "ไม่เคย",},
            {"เหลือง", "แดง", "เขียว","ฟ้า"},
            {"เคย", "ไม่เคย",},
            {"กระต่าย", "ม้าลาย", "ม้า","แมว"},
    };

    private String mCorrectAnswer[] = {
            "กระต่าย", "เคย", "เหลือง", "เคย", "ม้าลาย"
    };

    Integer images[] = {
            R.drawable.pic_1,
            R.drawable.img_2,
            R.drawable.pic_2,
            R.drawable.pic_3,
            R.drawable.pic_5
    };

    public String getQuestion(int a){
        String question = mQuestion[a];
        return question;
    }

    public String getChoice1(int a){
        String choice =mChoice[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice =mChoice[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice =mChoice[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice =mChoice[a][3];
        return choice;
    }

    public String getCorrectAnser(int a){
        String answer = mCorrectAnswer[a];
        return answer;
    }

    public int getImage(int a){
        int Image = images[a];
        return Image;
    }

}
