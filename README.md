# ايه هو البرنامج ده؟
- البرنامج ده هو عباره عن مثال لل Object Pool Design Pattern باستخدام لغة java
# بنستخدم امتي ال Design Pattern ده؟
- لما يكون عندي class و عايز اتحكم في ال objects اللي بتتعمل منه عن طريق اعادة استخدام ال objects اللي انتهي استخدامها بدل مايتعملها destroy و يتعمل create ل objects جديده (ده بيحسن جدا في ال performance في بعض الحالات لما يكون ال cost بتاعت ال create و ال destroy عاليه)
# بيتكون من ايه البرنامج ده ؟
- ال package بتاعت ال entities:
  - ال Student Class و ده اللي هيتعمله pool
- ال package بتاعت ال pools:
  - ال StudentPool و ده ال pool الخاص بال Student
