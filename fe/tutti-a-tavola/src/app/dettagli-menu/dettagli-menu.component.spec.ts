import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DettagliMenuComponent } from './dettagli-menu.component';

describe('DettagliMenuComponent', () => {
  let component: DettagliMenuComponent;
  let fixture: ComponentFixture<DettagliMenuComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DettagliMenuComponent]
    });
    fixture = TestBed.createComponent(DettagliMenuComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
