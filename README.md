# Декодер повідомлень

## Функціональність програми

Ця програма призначена для декодування зашифрованих повідомлень, які можуть бути закодовані двома різними методами: заміною голосних та заміною приголосних. Вона визначає метод кодування для кожного слова та відновлює оригінальний текст.

## Опис роботи

### Методи

- `decodeVowels(String input)`: Декодує повідомлення, закодоване методом заміни голосних, де голосні літери a, e, i, o, u замінюються на відповідні числа 1, 2, 3, 4, 5.
  
- `decodeConsonants(String input)`: Декодує повідомлення, закодоване методом заміни приголосних, де кожний приголосний замінюється на наступний приголосний в послідовності.

### Внутрішні функції

- `isConsonant(char c)`: Визначає, чи є символ приголосним.

- `getNextConsonant(char c)`: Знаходить наступний приголосний символ після заданого.

## Застосування "Five Why's" принципу

1. **Чому була створена ця програма?**
   - Для декодування зашифрованих повідомлень у форматі, який застосовує різні методи кодування.

2. **Чому потрібно декодувати повідомлення?**
   - Декодування повідомлень дозволяє отримати зрозумілу інформацію з зашифрованого тексту.

3. **Чому використовуються методи заміни голосних та приголосних?**
   - Ці методи надають можливість створювати різноманітні та цікаві шифри для зашифрованих повідомлень.

4. **Чому використовується регулярний вираз для визначення методу кодування?**
   - Регулярні вирази дозволяють ефективно визначати відповідності у тексті, спрощуючи визначення методу кодування.

5. **Чому використовується StringBuilder?**
   - Використання StringBuilder забезпечує ефективні маніпуляції з рядками та покращує продуктивність програми при зміні текстових даних.

## Тести

Програма включає набір тестів для перевірки правильності функціонування методів декодування:

1. **Тест `decodeVowels`**
   - Перевірка правильності декодування повідомлення за методом заміни голосних.

2. **Тест `decodeConsonants`**
   - Перевірка правильності декодування повідомлення за методом заміни приголосних.
