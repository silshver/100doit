package Optional;

/**
 * 파일명	 	: 덤벨정보
 * 설명		: 덤벨에대한 정보 입니다.
 * @author 100doit
 *
 */

public class Dumbbell {
	private String name;
	private int weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public static class Builder {
		private String name;
		private int weight;

		public Builder() {
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setWeight(int weight) {
			this.weight = weight;
			return this;
		}

		public Dumbbell build() {
			return new Dumbbell(this);
		}
	}

	public Dumbbell(Builder builder){
		this.name = builder.name;
		this.weight = builder.weight;
	}

	@Override
	public String toString() {
		return "java7vsjava8.Dumbbell{" +
			"name = '" + name + '\'' +
			", weight = " + weight +
			'}';
	}
	
}