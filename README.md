# SI_2023_lab2_203120

# Сани Раданлиева, 203120

## Control Flow Graph

![Screenshot 2023-05-31 at 21 35 31](https://github.com/SaniRadanlieva/SI_2023_lab2_203120/assets/86978339/b4435616-7a50-47ae-815e-2678cad9b1f9)


## Цикломатска комплексност

Со броење на регионите од Control Flow Graph-от од претходната слика, се добива дека цикломатската комплексност изнесува 11.

## Тест случаи според критериумот Every branch
Ги наоѓам следниве случаи според критериумот Every branch: кога не постои user, т.е user==null; кога нема доделен username т.е User(null, "Sani1234", "sani@g.com"); кога се користи " " во password т.е User("Sani", "Sa Ni1234", "sani@g.com") и кога постојат и username и email, но password<8 т.е User("Sani", "SaNi", "sani@g.com").

## Тест случаи според критериумот Multiple condition
Наоѓам четири случаи според критериумот Multiple condition. Тоа се случаите кога за одреден корисник постои username, password, email; кога за одреден корисник постои username и email, но не постои password; кога за одреден корисник постои username, password, но не постои email, и кога за одреден корисник не постои ниту username, ниту password, ниту email.

## Објаснување на напишаните unit tests
За напишаните тестови за Every Branch правам тест случаи за случајот:
- кога не постои user
- кога се внесува password и email, без username
- кога се внесува и username, и email, но password-от има " " во него
- кога се внесуваат два различни корисници
- кога се внесува username, password, email

За напишаните тестови за Multiple conditions правам тест случаи за случајот:
- кога за одреден корисник постои username, password, email
- кога за одреден корисник постои username и email, но не постои password
- кога за одреден корисник постои username, password, но не постои email
- кога за одреден корисник не постои ниту username, ниту password, ниту email.
