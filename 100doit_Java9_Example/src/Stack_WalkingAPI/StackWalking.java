package Stack_WalkingAPI;

/**
 * ���ϸ�	 	: Stack Walking API
 * ����		: Java9 �������� StackTrace() method�� ��ٸ� Java9���ʹ� Stack Walking�̶�� API�� ��� �� �� �ֽ��ϴ�. ���ϴ� �κи� ���� �̾� �� �� �ֱ� ������ �������� ����,
 * 			    ������� ���� ��ٷ� ���ϴ� ���� ã�ư��ִ� ��ũ�� �� �� ���մϴ�.
 * @author 100doit
 *
 */


public class StackWalking
{
   public static void main(String[] args)
   {
      a();
   }

   public static void a()
   {
      b();
   }

   public static void b()
   {
      c();
   }

   public static void c()
   {
      StackWalker sw = StackWalker.getInstance();
      sw.forEach(System.out::println);
   }
}

/*
 * ��� ��
Stack_WalkingAPI.StackWalking.c(StackWalking.java:32)
Stack_WalkingAPI.StackWalking.b(StackWalking.java:26)
Stack_WalkingAPI.StackWalking.a(StackWalking.java:21)
Stack_WalkingAPI.StackWalking.main(StackWalking.java:16)
 */