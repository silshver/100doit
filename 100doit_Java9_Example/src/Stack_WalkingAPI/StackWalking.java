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