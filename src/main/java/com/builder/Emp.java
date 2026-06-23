package com.builder;
//pojo class

public class Emp {

	private final String name;
	private final String empId;
	private final double salary;

	private Emp(String name, String empId, double salary) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}

	// without setters class is immutable. It can't be updated.

	public String getName() {
		return name;
	}

	public String getEmpId() {
		return empId;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", empId=" + empId + ", salary=" + salary + "]";
	}

	public static class Builder {

		private String name;
		private String empId;
		private double salary;

		public Builder name(String name) {
			this.name = name;
			// this keyword refers to current object of class.
			return this;

		}

		public Builder empId(String empId) {
			this.empId = empId;
			return this;
		}

		public Builder salary(double salary) {
			this.salary = salary;
			return this;
		}

		public Emp build() {
			// going to create object of outer class i.e Emp.

			Emp e1 = new Emp(name, empId, salary);
			return e1;

		}

	}

}
