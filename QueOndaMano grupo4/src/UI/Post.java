package UI;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Post implements Runnable
{
  private String[] messages = new String[] {
      "Hello?",
      "Hey, what's up?",
      "Where are you?",
      "Right behind you.",
      "Stop following me!",
      "But you owe me money.",
      "I'll gladly repay you on Tuesday.",
      "You said that last week!",
      "But now I actually have a job."
  };
  private int msgCounter = 0;
  private JPanel panel;
  private JScrollPane scrollPane;
  private Timer timer;

  public static void main(String[] args)
  {
    SwingUtilities.invokeLater(new Post());
  }

  public void run()
  {
    panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

    scrollPane = new JScrollPane(panel);
    scrollPane.setVerticalScrollBarPolicy(
        JScrollPane.VERTICAL_SCROLLBAR_NEVER);
    scrollPane.setAutoscrolls(true);

    JFrame frame = new JFrame("Message App");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
    frame.setSize(260, 180);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);

    timer = new Timer(1500, new ActionListener()
    {
      public void actionPerformed(ActionEvent event)
      {
        if (msgCounter < messages.length)
        {
          addMessage(messages[msgCounter]);
        }
        else
        {
          timer.stop();
        }
      }
    });
    timer.start();
  }

  private void addMessage(String text)
  {
    boolean rightAligned = msgCounter % 2 != 0;
    Color color = rightAligned ? Color.CYAN : Color.ORANGE;

    JLabel label = new JLabel(text);
    label.setOpaque(true);
    label.setBackground(color);
    label.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(Color.BLUE),
        BorderFactory.createEmptyBorder(2,4,2,4)
    ));

    JPanel p = new JPanel();
    p.setLayout(new BoxLayout(p, BoxLayout.X_AXIS));
    p.setBorder(BorderFactory.createEmptyBorder(2,4,2,4));

    if (rightAligned)
    {
      p.add(Box.createHorizontalGlue());
      p.add(label);
    }
    else
    {
      p.add(label);
      p.add(Box.createHorizontalGlue());
    }

    panel.add(p);
    panel.revalidate();
    int x = panel.getPreferredSize().width;
    int y = panel.getPreferredSize().height;
    panel.scrollRectToVisible(new Rectangle(x-1 ,y-1, 1, 1));

    msgCounter++;
  }
}