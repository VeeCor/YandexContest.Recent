Условия задачи:

2. Недавние

В приложении для звонков есть список недавно набранных номеров. Всего в списке недавних может быть до m номеров. Работа списка устроена следующим образом:
Если осуществляется звонок на номер, которого нет в списке и список не заполнен (в нем строго меньше m номеров), то этот номер добавляется в начала списка. Если же список заполнен (в нем ровно m номеров), то самый последний номер удаляется, а новый номер добавляется в начало списка.
Если осуществляется звонок на номер, который есть в списке, то он перемещается в начало списка.
Определите, как будет выглядеть список недавних номеров после нескольких звонков.

Формат ввода:
В первой строке содержится два числа: m и n (1 ≤ m, n ≤ 1000) — количество номеров, которое может храниться в списке, и количество звонков соответственно.
В следующих n строках заданы номера, на которые осуществлялись звонки. Каждый номер состоит из знака + и произвольных цифр, длина номера не превосходит 15 символов.

Формат вывода:
Выведите m строк — содержимое списка недавних после всех звонков. Если позиция в списке недавних пуста, то выведите на ее месте <Empty>

Пример 1
Ввод:
2 3
+71001234567
+72001234567
+71001234567
Вывод:
+71001234567
+72001234567

Пример 2
Ввод:
2 1
+71232223344
Вывод:
+71232223344
<Empty>
