package com.zipcodewilmington.singlylinkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    SinglyLinkedList singlyLinkedList;
    @Before
    public void setUpSinglyLinkedList() {
        singlyLinkedList = new SinglyLinkedList();
    }

    @Test
    public void testInitialEmptyList() {
        // Given
        // When
        Node actual = singlyLinkedList.headNode;
        // Then
        assertNull(actual);
    }

    @Test
    public void testAddElementToList() {
        // Given
        // When
        singlyLinkedList.add(11);
        Node actual = singlyLinkedList.headNode;
        // Then
        assertNotNull(actual);
//        singlyLinkedList.getSize();
        assertEquals(1, (int) singlyLinkedList.getSize());
    }

    @Test
    public void testGetListSize() {
        // Given
        // When
        singlyLinkedList.add(11);
        singlyLinkedList.add(209);
        singlyLinkedList.add(83);
        Integer expected = 3;
        Integer actual = singlyLinkedList.getSize();
        // Then
        assertEquals(expected,actual);
    }

    @Test
    public void testGetNodeValueByIndex() {
        // Given
        singlyLinkedList.add(11);
        singlyLinkedList.add(209);
        singlyLinkedList.add(83);
        // When
        Integer expected = 83;
        Integer actual = singlyLinkedList.get(2).nodeValue;
        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testIfListContainsNodeValue3_True() {
        // Given
        singlyLinkedList.add(10);
        singlyLinkedList.add(22);
        singlyLinkedList.add(18);
        singlyLinkedList.add(348);
        singlyLinkedList.add(3);
        singlyLinkedList.add(95);
        // When
        Boolean expectedForFindingNodeValue3 = true;
        Boolean actualForFindingNodeValue3 = singlyLinkedList.contains(3);
        // Then
        assertEquals(expectedForFindingNodeValue3, actualForFindingNodeValue3);
    }

    @Test
    public void testIfListContainsNodeValue80_False() {
        // Given
        singlyLinkedList.add(10);
        singlyLinkedList.add(22);
        singlyLinkedList.add(18);
        singlyLinkedList.add(348);
        singlyLinkedList.add(3);
        singlyLinkedList.add(95);
        // When
        Boolean expectedForFindingNodeValue80 = false;
        Boolean actualForFindingNodeValue80 = singlyLinkedList.contains(80);
        // Then
        assertEquals(expectedForFindingNodeValue80, actualForFindingNodeValue80);
    }

    @Test
    public void testFindIndexAndReturnElement() {
        // Given
        singlyLinkedList.add(866);
        singlyLinkedList.add(28);
        singlyLinkedList.add(3);
        singlyLinkedList.add(55);
        singlyLinkedList.add(193);
        // When
        singlyLinkedList.remove(3);
        Integer expectedSize = 4;
        Integer actualSize = singlyLinkedList.getSize();
        assertEquals(expectedSize, actualSize);
        assertFalse(singlyLinkedList.contains(55));
//        assertEquals(expectedHeadNode,actualHeadNode);
    }

}
