package com.example.demo.AInitData;

import com.example.demo.KReposotiry.FriendsRepo;
import com.example.demo.KReposotiry.Question;
import com.example.demo.KReposotiry.QuestionsOnly;
import com.example.demo.KReposotiry.UserData;
import com.example.demo.Model.Friends;
import com.example.demo.Model.QuestionsAndAnswer;
import com.example.demo.Model.QuestionsTable;
import com.example.demo.Model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class inData implements CommandLineRunner {

    @Autowired
    private UserData userDataRepo;

    @Autowired
    private Question questionRepo;

    @Autowired
    private QuestionsOnly questionsOnlyRepo;

    @Autowired
    private FriendsRepo friendsRepo;

    @Override
    public void run(String... args) throws Exception {
        try{
            UserInfo   u  = new UserInfo();
            u.setUsername("Abddo");
            u.setPassword("abo");
            u.setFullName("AbdElrahman");
            u.setEmail("www.aboo@yahoo.com");
            u.setDateOfBirth("8/8/1998");

            Friends f1 = new Friends();
            f1.setUsername("nasr");
            f1.setEmail("@nasr");
            f1.setUserInfo(u);

            Friends f2 = new Friends();
            f2.setUsername("Mostsfa");
            f2.setEmail("@mostafa");
            f2.setUserInfo(u);

            Friends f3 = new Friends();
            f3.setUsername("hassan");
            f3.setEmail("@hassan");
            f3.setUserInfo(u);

            Friends f4 = new Friends();
            f4.setUsername("tarek");
            f4.setEmail("@tarek");
            f4.setUserInfo(u);



            QuestionsAndAnswer q1 = new QuestionsAndAnswer();
            q1.setQuestion("who are you");
            q1.setAnswer("i am Abdo");
             q1.setUser(u);

            QuestionsAndAnswer q2 = new QuestionsAndAnswer();
            q2.setQuestion("how old are you");
            q2.setAnswer("i am 20");
            q2.setUser(u);

            QuestionsAndAnswer q3 = new QuestionsAndAnswer();
            q3.setQuestion("where are you from");
            q3.setAnswer("i am from tanta");
            q3.setUser(u);


            /*********************************************/

            QuestionsTable qT1 = new QuestionsTable();
            qT1.setQuestion("what is your job");
            qT1.setUserInfo(u);

            QuestionsTable qT2 = new QuestionsTable();
            qT2.setQuestion("How many brother do you have");
            qT2.setUserInfo(u);

            QuestionsTable qT3 = new QuestionsTable();
            qT3.setQuestion("what is father job");
            qT3.setUserInfo(u);

            QuestionsTable qT4= new QuestionsTable();
            qT4.setQuestion("Are you single");
            qT4.setUserInfo(u);

            userDataRepo.save(u);
                questionRepo.save(q1);
                questionRepo.save(q2);
                questionRepo.save(q3);

                questionsOnlyRepo.save(qT1);
                questionsOnlyRepo.save(qT2);
                questionsOnlyRepo.save(qT3);
                questionsOnlyRepo.save(qT4);

                friendsRepo.save(f1);
                friendsRepo.save(f2);
                friendsRepo.save(f3);
                friendsRepo.save(f4);




        }
        catch (Exception c){
            c.printStackTrace();
        }

    }
}
