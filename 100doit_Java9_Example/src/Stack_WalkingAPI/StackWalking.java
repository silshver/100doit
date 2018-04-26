package Stack_WalkingAPI;

/**
 * 파일명	 	: Stack Walking API
 * 설명		: Java9 이전에는 StackTrace() method를 썼다면 Java9부터는 Stack Walking이라는 API를 사용 할 수 있습니다. 원하는 부분만 따로 뽑아 볼 수 있기 떄문에 가독성도 좋고,
 * 			    디버깅할 때에 곧바로 원하는 줄을 찾아가주는 링크로 좀 더 편리합니다.
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
 * 결과 값
Stack_WalkingAPI.StackWalking.c(StackWalking.java:32)
Stack_WalkingAPI.StackWalking.b(StackWalking.java:26)
Stack_WalkingAPI.StackWalking.a(StackWalking.java:21)
Stack_WalkingAPI.StackWalking.main(StackWalking.java:16)
 */