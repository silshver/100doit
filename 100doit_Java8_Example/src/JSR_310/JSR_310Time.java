package JSR_310;

import static org.fest.assertions.api.Assertions.*;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatter;
import java.time.zone.ZoneRules;
import java.time.zone.ZoneRulesException;

import org.junit.Test;

public class JSR_310Time {  
	
	//http://d2.naver.com/helloworld/645609
	/*
	 *  1582년 10월 4일의 하루 뒤를 계산하는 테스트
	 */
	@Test
	public void shouldGetAfterOneDay() {
		LocalDate theDay = IsoChronology.INSTANCE.date(1582, 10, 4);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		assertThat(theDay.format(formatter)).isEqualTo("1582.10.04");
		
		LocalDate nextDay = theDay.plusDays(1);
		assertThat(nextDay.format(formatter)).isEqualTo("1582.10.05");
	}
	
	/*
	 * 1961년 8월 9일의 1분후를 계산하는 테스트
	 */
	@Test
	public void shouldGetAfterOneMinute() {
		ZoneId seoul = ZoneId.of("Asia/Seoul");
		ZonedDateTime theTime = ZonedDateTime.of(1961, 8, 9, 23, 59, 59, 0, seoul);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");
		assertThat(theTime.format(formatter)).isEqualTo("1961.08.09 23:59");
		
		ZonedDateTime after1Minute = theTime.plusMinutes(1);
		assertThat(after1Minute.format(formatter)).isEqualTo("1961.08.10 00:30");
	}
	
	/*
	 * 2012년 6월 30일 마지막날의 2초후를 계산하는 테스트
	 */
	@Test
	public void shouldGetAfterTwoSecond() {
		ZoneId utc = ZoneId.of("UTC");
		ZonedDateTime theTime = ZonedDateTime.of(2012, 6, 30, 23, 59, 59, 0, utc);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
		assertThat(theTime.format(formatter)).isEqualTo("2012.06.30 23:59:59");
		
		ZonedDateTime after2Seconds = theTime.plusSeconds(2);
		assertThat(after2Seconds.format(formatter)).isEqualTo("2012.07.01 00:00:01");
	}

	/*
	 * 
	 */
	@Test(expected=ZoneRulesException.class)
	public void shouldThrowExceptionWhenWrongTimeZoneId(){
		ZoneId.of("Seoul/Asia");
	}
	
	/*
	 * 날짜의 년 월일을 get하는 테스트
	 */
	@Test
	public void shouldGetDate() {
		LocalDate theDay = LocalDate.of(1999, 12, 31);
		
		assertThat(theDay.getYear()).isEqualTo(1999);
		assertThat(theDay.getMonthValue()).isEqualTo(12);		
		assertThat(theDay.getDayOfMonth()).isEqualTo(31);		
	}
	
	
	@Test(expected=DateTimeException.class)
	public void shouldNotAcceptWrongDate() {
		LocalDate.of(1999, 13, 31);
	}

	@Test
	public void shouldGetDayOfWeek() {
		LocalDate theDay = LocalDate.of(2014, 1, 1);
		
		DayOfWeek dayOfWeek = theDay.getDayOfWeek();
		assertThat(dayOfWeek).isEqualTo(DayOfWeek.WEDNESDAY);
	}
}