/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmentsystem;

/**
 *
 * @author ppp
 */

public class Subjects {
    
    public static String[] subjectList;
    public static int[] subjectUnits;
    
    //Subjects and Units data
    public String[] FirstYearFirstSem = { "GRAPHICS DESIGN 1 LAB","INTRODUCTION TO COMPUTING LEC","INTRODUCTION TO COMPUTING LAB",
    "NSTP 1","PHYSICAL EDUCATION 1", "SEARCHING FOR GOD IN THE WORLD TODAY", "ETHICS", "PURPOSIVE COMMUNICATION", 
    "COMPUTING 1", "COMPUTER PROGRAMMING 1 LAB", "COMPUTER PROGRAMMING 1 LEC", "MATHEMATICS IN THE MODERN WORLD"};
    
    public int[] FirstYearFirstSemUnits = {1,2,1,3,2,3,3,3,3,1,2,3};
    
    public String[] FirstYearSecondSem = { "APPLIED PHYSICS FOR IT LEC", "PHYSICAL EDUCATION 2",
        "UNDERSTANDING THE SELF 3", "SCIENCE, TECHNOLOGY AND SOCIETY", "RESPONDING TO GOD`S CALL BY BECOMING FULLY HUMAN", 
    "COMPUTING 2", "COMPUTER PROGRAMMING 2 LAB", "COMPUTER PROGRAMMING 2 LEC", "OBJECT ORIENTED PROG'G. LAB", 
    "OBJECT ORIENTED PROG'G. LEC", "APPLICATIONS DEVT & EMERGING TECHNOLOGIES LAB","APPLICATIONS DEVT & EMERGING TECHNOLOGIES LEC",
    "APPLIED PHYSICS FOR IT LAB", "NSTP 2"};
    
    public int[] FirstYearSecondSemUnits = {2,2,3,3,3,3,1,2,1,2,1,2,1,3};
    
    public String[] SecondYearFirstSem = {"COMPUTER ANIMATION LAB","PHYSICAL EDUCATION 3", "CELEBRATING GOD`S PRESENCE AS A CHRISTIAN COMM",
        "READINGS IN PHILIPPINE HISTORY", "ART APPRECIATION", "THE CONTEMPORARY WORLD", "COMPUTING 3 ", 
        "DISCRETE STRUCTURES 1", "DIGITAL DESIGN LEC","DATA STRUCTURE & ALGORITHM", "DIGITAL DESIGN LAB"};
    
    public int[] SecondYearFirstSemUnits = {1,2,3,3,3,3,3,3,2,3,1};
    
    public String[] SecondYearSecondSem = {"INFORMATION MANAGEMENT LEC","PHYSICAL EDUCATION 4", "TRANSFORMING THE WORLD WITH VINCENT DE PAUL", 
        "RIZAL'S LIFE & WORKS", "OPERATIONS RESEARCH", "NUMERICAL ANALYSIS", "ARTIFICIAL INTELLIGENCE", 
        "PROGRAMMING LANGUAGES", "DISCRETE STRUCTURES 2", "INFORMATION MANAGEMENT LAB", "ENVIRONMENTAL SCIENCE"};
    
    public int[] SecondYearSecondSemUnits = {2,2,3,3,3,3,3,3,3,1,3};
    
    public String[] ThirdYearFirstSem = {"TECHNOPRENEURSHIP","ADVANCED STATISTICS", "EQUIRED SPECIALIZATION COURSE 2", 
        "COMP ORG & ASSEMBLY LANG LEC", "REQUIRED SPECIALIZATION COURSE 1", "ALGORITHMS AND COMPLEXITY", "COMP ORG & ASSEMBLY LANG LAB", 
        "AUTOMATA THEORY & FORMAL LANGUAGES", "SOFTWARE ENGINEERING 1", "POLITICS & GOVERNANCE WITH PHILIPPINE CONSTITUTION"};
    
    public int[] ThirdYearFirstSemUnits = {3,3,3,2,3,3,1,3,3,3};
    
    public String[] ThirdYearSecondSem ={"CS RESEARCH PROJECT 1","PROFESSIONAL ELECTIVE 1", "HUMAN COMPUTER INTERACTION", 
        "REQUIRED SPECIALIZATION COURSE 3", "SOFTWARE ENGINEERING 2", "OPERATING SYSTEMS LAB.","OPERATING SYSTEMS LEC",
          "NETWORKS AND COMMUNICATION LAB", "NETWORKS AND COMMUNICATION LEC", "BASIC ACCOUNTING"};
    
        public int[] ThirdYearSecondSemUnits = {3,3,3,3,3,1,2,1,2,3};
        
    public String[] FourthYearFirstSem ={"PROFESSIONAL ETHICS","CS RESEARCH PROJECT 2", "PROFESSIONAL ELECTIVE 2", 
        "PROFESSIONAL ELECTIVE 3"};
    
    public int[] FourthYearFirstSemUnits ={3,3,3,3};
    
    public String[] FourthYearSecondSem ={"INFORMATION ASSURANCE & SECURITY LEC","INFORMATION ASSURANCE AND SECURITY LAB",
             "PROFESSIONAL ELECTIVE 4	", "APPRENTICESHIP"};
    
    public int[] FourthYearSecondSemUnits ={2,1,3,6};
    
    //Get subject list based on the user's year level and semester
    public void subjectList(){
        PersonalInfos infos = new PersonalInfos();
        if(infos.course=="B.S. Computer Science"){
            if(infos.yearLevel == "1st Year"){
                if(infos.semester == "1st Semester"){
                    subjectList = FirstYearFirstSem;
                    subjectUnits = FirstYearFirstSemUnits;
                }
                else{
                    subjectList = FirstYearSecondSem;
                    subjectUnits = FirstYearSecondSemUnits;
                }
            }
            else if(infos.yearLevel == "2nd Year"){
                if(infos.semester == "1st Semester"){
                    subjectList = SecondYearFirstSem;
                    subjectUnits = SecondYearFirstSemUnits;
                }
                else{
                    subjectList = SecondYearSecondSem;
                    subjectUnits = SecondYearSecondSemUnits;
                }
            }
            else if(infos.yearLevel == "3rd Year"){
                if(infos.semester == "1st Semester"){
                    subjectList = ThirdYearFirstSem;
                    subjectUnits = ThirdYearFirstSemUnits;
                }
                else{
                    subjectList = ThirdYearSecondSem;
                    subjectUnits = ThirdYearSecondSemUnits;
                }
            }
            else if(infos.yearLevel == "4th Year"){
                if(infos.semester == "1st Semester"){
                    subjectList = FourthYearFirstSem;
                    subjectUnits = FourthYearFirstSemUnits;
                }
                else{
                    subjectList = FourthYearSecondSem;
                    subjectUnits = FourthYearSecondSemUnits;
                }
            }
        }
    }
    
}   
