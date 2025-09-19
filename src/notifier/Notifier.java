// File: notifier/Notifier.java
package notifier;

/**
 * Notification contract. Any concrete notifier must implement this interface
 */
public interface Notifier {
    /// &#x41E;&#x442;&#x43F;&#x440;&#x430;&#x432;&#x43B;&#x44F;&#x435;&#x442; &#x441;&#x43E;&#x43E;&#x431;&#x449;&#x435;&#x43D;&#x438;&#x435; &#x43F;&#x43E;&#x43B;&#x443;&#x447;&#x430;&#x442;&#x435;&#x43B;&#x44E;.
    /// @param recipient &#x43F;&#x43E;&#x43B;&#x443;&#x447;&#x430;&#x442;&#x435;&#x43B;&#x44C; (email, &#x43D;&#x43E;&#x43C;&#x435;&#x440; &#x442;&#x435;&#x43B;&#x435;&#x444;&#x43E;&#x43D;&#x430;, &#x43D;&#x438;&#x43A; &#x432; Telegram &#x438; &#x442;.&#x434;.)
    /// @param message &#x441;&#x43E;&#x43E;&#x431;&#x449;&#x435;&#x43D;&#x438;&#x435;
    /// @return true &#x435;&#x441;&#x43B;&#x438; &#x43E;&#x442;&#x43F;&#x440;&#x430;&#x432;&#x43A;&#x430; &#x443;&#x441;&#x43F;&#x435;&#x448;&#x43D;&#x43E; &#x437;&#x430;&#x432;&#x435;&#x440;&#x448;&#x435;&#x43D;&#x430;, &#x438;&#x43D;&#x430;&#x447;&#x435; false
    /// @throws Exception &#x43F;&#x440;&#x438; &#x43E;&#x448;&#x438;&#x431;&#x43A;&#x435; &#x43E;&#x442;&#x43F;&#x440;&#x430;&#x432;&#x43A;&#x438; (&#x43F;&#x43E;&#x43B;&#x44C;&#x437;&#x43E;&#x432;&#x430;&#x442;&#x435;&#x43B;&#x44C; &#x43C;&#x43E;&#x436;&#x435;&#x442; &#x437;&#x430;&#x43C;&#x435;&#x43D;&#x438;&#x442;&#x44C; &#x43D;&#x430; &#x431;&#x43E;&#x43B;&#x435;&#x435; &#x43A;&#x43E;&#x43D;&#x43A;&#x440;&#x435;&#x442;&#x43D;&#x43E;&#x435; &#x438;&#x441;&#x43A;&#x43B;&#x44E;&#x447;&#x435;&#x43D;&#x438;&#x435;)
    boolean send(String recipient, String message) throws Exception;
}