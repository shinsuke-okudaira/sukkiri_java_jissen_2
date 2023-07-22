/*
 * package suukiri_java_jissen_2;
 * 
 * public class StrongBox<E> { private E cashBox; private int count; private
 * KeyType keyType;
 * 
 * public StrongBox(final KeyType key) { keyType = key; }
 * 
 * public void put(final E c) { cashBox = c; }
 * 
 * public E get() { count++;
 * 
 * switch (keyType) { case PADLOCK: if (count < 1024) { return null; } break;
 * case BUTTON: if (count < 10000) { return null; } break; case DIAL: if (count
 * < 30000) { return null; } break; case FINGER: if (count < 1000000) { return
 * null; } count = 0; return cashBox; } } }
 */