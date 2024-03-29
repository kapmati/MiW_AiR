/**
 * Created by Kapmat on 2016-03-15.
 **/

package Lab4;

import java.util.ArrayList;
import java.util.List;

public class Node <T> implements Comparable<T>{

	private Level level;
	private T value;

	private List<Node> children;
	private List<Node> parents;

	//Only for KIND_OF_PARAM nodes
	private double minValue = 0.0;
	private double maxValue = 0.0;
	private double range = 0.0;

	//Only for VALUE_OF_PARAM & INDEX nodes
	private double factor = 0.0;

	public enum Level {
		PARAM, KIND_OF_PARAM, VALUE_OF_PARAM, INDEX, TYPE_OF_OBJECT, CLASS_OF_OBJECT, NONE
	}

	public Node() {
		level = Level.NONE;
		children = new ArrayList<>();
		parents = new ArrayList<>();
	}

	public Node(Level level, List<Node> children, List<Node> parents) {
		this.level = level;
		this.children = children;
		this.parents = parents;
	}

	public Node(Level level,T value) {
		this.level = level;
		this.value = value;
	}

	public T getValue(){
		return value;
	}

	public Level getLevel(){
		return this.level;
	}

	public void setChildren(List<Node> children) {
		this.children = children;
	}

	public void setParents(List<Node> parents) {
		this.parents = parents;
	}

	public double getMinValue() {
		return minValue;
	}

	public void setMinValue(double minValue) {
		this.minValue = minValue;
	}

	public double getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(double maxValue) {
		this.maxValue = maxValue;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public double getFactor() {
		return factor;
	}

	public void setFactor(double factor) {
		this.factor = factor;
	}

	public List<Node> getChildren() {
		return this.children;
	}

	public List<Node> getParents() {
		return this.parents;
	}

	@Override
	public int compareTo(T secondValue) {
		Double second;
		Double first;
		if (secondValue instanceof Node) {
			second = (Double) this.getValue();
			first = (Double) ((Node) secondValue).getValue();
			if (second < first) {
				return -1;
			} else if (second > first) {
				return 1;
			} else {
				return 0;
			}
		}
		return 0;
	}
}


