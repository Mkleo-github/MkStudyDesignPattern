package com.mkleo.S17迭代器模式;

/**
 * @说明:
 * @作者: Wang HengJin
 * @日期: 2018/5/17 15:25 星期四
 */
public class NameRepository implements Container {

    public String names[] = {"Robot", "John", "Lucy", "Atom", "Lora"};


    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }


    private class NameIterator implements Iterator<String> {

        int position;

        @Override
        public boolean hasNext() {

            if (position < names.length) {
                return true;
            }

            return false;
        }

        @Override
        public String next() {

            if (this.hasNext()) {
                return names[position++];
            }

            return null;
        }
    }
}
