using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace HK2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            panelleft.Height = buttonTasks.Height;
            panelleft.Top = buttonTasks.Top;
        }

        private void label3_Click(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void buttonDashboard_Click(object sender, EventArgs e)
        {
            panelleft.Height = buttonDashboard.Height;
            panelleft.Top = buttonDashboard.Top;
        }

        private void buttonSellers_Click(object sender, EventArgs e)
        {
            panelleft.Height = buttonSellers.Height;
            panelleft.Top = buttonSellers.Top;
        }

        private void buttonCalender_Click(object sender, EventArgs e)
        {
            panelleft.Top = buttonCalender.Top;
            panelleft.Height = buttonCalender.Height;
        }
    }
}
