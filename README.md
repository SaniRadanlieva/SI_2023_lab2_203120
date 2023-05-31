# SI_2023_lab2_203120

# Сани Раданлиева, 203120

## Control Flow Graph

![Screenshot 2023-05-31 at 21 35 31](https://github.com/SaniRadanlieva/SI_2023_lab2_203120/assets/86978339/12d82276-4425-430e-8961-49ced527b94d)

## Цикломатска комплексност

Со броење на регионите од Control Flow Graph-от од претходната слика, се добива дека цикломатската комплексност изнесува 11.

## Тест случаи според критериумот Every branch
Наоѓам шест случаи според критериумот Every branch. Тоа се случаите кога username==null, по што следи дека username==email и password.length<8; кога user==null; кога постојат дупликати email и username; кога во password нема дупли наводници и има специјален знак; кога во меилот нема точка или мајмунче и кога во password има дупли наводници.

## Тест случаи според критериумот Multiple condition
Наоѓам четири случаи според критериумот Multiple condition. Тоа се случаите кога user==null; кога за одреден корисник постои username, password, email; кога за одреден корисник постои username и email, но не постои password; кога за одреден корисник постои username, password, но не постои email.


